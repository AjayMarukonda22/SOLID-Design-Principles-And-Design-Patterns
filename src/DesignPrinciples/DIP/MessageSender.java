package DesignPrinciples.DIP;

public class MessageSender {

    private Messenger messenger;
    public MessageSender(Messenger messenger) {
        this.messenger = messenger;
    }

    public Messenger getMessanger() {
        return messenger;
    }

    public void setMessanger(Messenger messenger) {
        this.messenger = messenger;
    }

    public String send(){
       return  messenger.sendMessage();
    }
}
