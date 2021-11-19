package com.sda.codeWmoshEssential.dAbstraction;

public class MailService {

    public void sendEmail() {
        connect();
        authenticate();
        disconnect();
    }

    private void connect() {
        System.out.println("connect");
    }

    private void disconnect() {
        System.out.println("disconnect");
    }

    private void authenticate() {
        System.out.println("authenticate");
    }
}
