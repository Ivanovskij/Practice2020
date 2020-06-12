package org.practice2020.oop.mail;

public class MailSender implements Sender {

    @Override
    public boolean send(Message message) {
        ProcessMessage processMessage = new ProcessMessage(message);
        if (processMessage.isEmpty()) {
            throw new RuntimeException("Message is empty");
        }

        // the message was sent
        return true;
    }
}
