/**
 * Created by roberto on 14/04/2016.
 */
public class mounstruo extends personaje {

    private String descendencia;

    public String toString(){

        return super.getNombre();
    }

    public String getDescendencia(){

        return descendencia;
    }

    public void setDescendencia(String descendencia){
        this.descendencia = descendencia;
    }

    public String que_esM(){

        return ("soy un mounstruo");
    }
}
