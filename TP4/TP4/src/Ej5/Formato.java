package Ej5;

public class Formato implements HTMLText{

    private HTMLText texto;
    private String format;

    public Formato(HTMLText texto, String format){
        this.texto = texto;
        this.format = format;
    }
    @Override
    public String source() {
        return String.format("<%s>%s<%s>", format, texto.source(), format);
    }

    @Override
    public String toString(){
        return source();
    }
}
