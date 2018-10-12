package com.example.erhan.parselearning;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("FFsnypZ7GoaVk6eOuaCdgdtUfmRqtJ20fKs6N0jo")
                .clientKey("xluXUJWS2c9SFfUNYCZZwe8iW5T6UuRDXqPPefds")
                .server("https://parseapi.back4app.com/")
                .build()

        );
    }
}
