package Ej5;

public class PlainText implements HTMLText {

    private String string;

    public PlainText(String text){
        setText(text);
    }
    public void setText(String string){
        this.string = string;
    }

    @Override
    public String source() {
        return string;
    }
    @Override
    public String toString(){
        return source();
    }
}
