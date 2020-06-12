package org.practice2020.oop.mail;

public class ProcessMessage {

    private Message message;

    public ProcessMessage(Message message) {
        this.message = message;
    }

    public boolean isEmpty() {
        return message.getMessage().isEmpty();
    }
}
