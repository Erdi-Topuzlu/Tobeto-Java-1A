package org.example.core.logging;

public class MailLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("E-Posta Gönderildi : " + data);
    }
}
