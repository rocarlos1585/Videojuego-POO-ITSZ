/**
 * Created by roberto on 14/04/2016.
 */
public class personaje {

   // instancia de clase

   public static main Main = new main();



   private String nombre;
   private String poder;
   private String sexo;
   private String origen;
   private String edad;
   private int op;
   private int vida;





    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public String getPoder(){
        return poder;
    }

    public void setPoder(String poder){

        this.poder = poder;
    }

    public String getSexo(){

        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getOrigen(){
        return origen;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }

    public String getEdad(){
        return edad;
    }

    public void setEdad(String edad){
        this.edad = edad;
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

}
