package objectOriented.assignment2;

public class Document {

    public String text;

    public Document(String textDoc){
        setText(textDoc);
    }

    public void setText(String newTextDoc){
        text = newTextDoc;
    }

    public String toString(){
        return text;
    }
}
