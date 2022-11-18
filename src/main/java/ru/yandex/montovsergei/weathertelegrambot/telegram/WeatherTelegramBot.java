package ru.yandex.montovsergei.weathertelegrambot.telegram;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.yandex.montovsergei.weathertelegrambot.model.Mapper;
import ru.yandex.montovsergei.weathertelegrambot.webclient.WebClientInterface;

import java.util.Objects;

@Component
public class WeatherTelegramBot extends TelegramLongPollingBot {
    private Message requestMessage = new Message();
    private final SendMessage response = new SendMessage();
    TelegramBotsApi telegramBotsApi;
    private final WebClientInterface client;

    private final String botUsername;
    private final String botToken;

    @SneakyThrows
    public WeatherTelegramBot(WebClientInterface client,
                              @Value("${telegram-bot.name}") String botUsername,
                              @Value("${telegram-bot.token}") String botToken,
                              TelegramBotsApi telegramBotsApi) {
        this.client = client;
        this.botUsername = botUsername;
        this.botToken = botToken;
        this.telegramBotsApi=telegramBotsApi;
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        requestMessage = update.getMessage();
        response.setChatId(requestMessage.getChatId().toString());
        if(requestMessage.getText().equals("/start")){
           defaultMsg(response, "Write the command to show current weather : \n " + "/current=name of City");
        }else if (requestMessage.getText().startsWith("/current")){
            String[] location=requestMessage.getText().split("=");
            String loc=location[1];
            defaultMsg(response, Mapper.toResponseDto(Objects.requireNonNull(client.getCurrentWeather(loc).block())).toString());
        }
    }

    private void defaultMsg(SendMessage response, String msg) throws TelegramApiException {
        response.setText(msg);
        execute(response);
    }
}
