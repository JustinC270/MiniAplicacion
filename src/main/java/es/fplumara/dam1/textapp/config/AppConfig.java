package es.fplumara.dam1.textapp.config;

import es.fplumara.dam1.textapp.exceptions.ConfigException;


import java.util.Properties;

public class AppConfig {

    private String storeType;

    private String messagesFile;

    private int maxLength;


    public String getStoreType() {
        return storeType;
    }

    public String getMessagesFile() {
        return messagesFile;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public AppConfig() throws ConfigException {

        Properties properties = new Properties();


    }
}
