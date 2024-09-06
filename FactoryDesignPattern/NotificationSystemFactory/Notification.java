package com.assignment.question;

public abstract class Notification {
    protected String recipient;
    protected String message;

    public abstract NotificationType notificationType();
    public abstract String getRecipient();
    public abstract String getMessage();
    public abstract void sendNotification();

}