package DesignPrinciples.DIP;

public class EmailMessage implements Messenger {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String sendMessage() {
        return message;
    }
}
