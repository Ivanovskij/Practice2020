package org.practice2020.oop.mail;

import org.junit.Assert;
import org.junit.Test;

public class SenderTest {

    @Test(expected = RuntimeException.class)
    public void shouldBeEmptyMessageException() {
        Sender sender = new MailSender();
        sender.send(new Message(""));
    }

    @Test
    public void shouldSentVkSender() {
        Sender sender = new VkSender();
        boolean actualResult = sender.send(new Message("The message must be sent via vksender"));
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void shouldSentMailSender() {
        Sender sender = new MailSender();
        boolean actualResult = sender.send(new Message("The message must be sent via mailsender"));
        Assert.assertEquals(true, actualResult);
    }
}
