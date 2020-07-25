package objectOriented.assignment2;

public class Email extends Document {
    public String title;
    public String sender;
    public String recipient;

    public Email(String textDoc, String senderMsg, String recipientMsg, String titleMsg) {
        super(textDoc);
        title = titleMsg;
        sender = senderMsg;
        recipient = recipientMsg;
    }

    public String getTitle() {
        return title;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getText(){
        return super.toString();
    }

    public void setTitle(String newtitleMsg) {
        this.title = newtitleMsg;
    }


    public void setSender(String newsenderMsg) {
        this.sender = newsenderMsg;
    }

    public void setRecipient(String newrecipientMsg) {
        this.recipient = newrecipientMsg;
    }

    public String toString(){
        return "From: " + sender + "\nTo: " + recipient + "\n" + title + "\n\n" + super.toString();
    }
}

