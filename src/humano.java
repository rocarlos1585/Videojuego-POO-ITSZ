/**
 * Created by roberto on 14/04/2016.
 */
public class humano extends personaje {



    private String arma;
    private String debilidad;


    public String toString(){

        return super.getNombre();


    }



    public String getArma(){
        return arma;

    }

    public void setArma(String arma){
        this.arma = arma;
    }

    public String que_esH(){

        return ("soy humano");
    }

    public String getDebilidad(){
        return debilidad;
    }

    public void setDebilidad(String debilidad){
        this.debilidad = debilidad;
    }
}
