package org.example.core.logging;

public class DatabaseLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Log verileri veritabanına kayıt edildi : " + data);
    }
}