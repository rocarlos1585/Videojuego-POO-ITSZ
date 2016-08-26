import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by roberto on 14/04/2016.
 */
public class main {
    static Scanner scan = new Scanner(System.in);

    static ArrayList<personaje> Personaje = new ArrayList<>();

    public static void main(String[] args) {

        suitch1();
    }

    public static void suitch1() {
        int opcion;


        do {
            System.out.println(" _____________________________________________");
            System.out.println("|este programa es para dar de alta personajes |");
            System.out.println("|             elije un personaje              |");
            System.out.println("|                1- mounstruo                 |");
            System.out.println("|                  2- humano                  |");
            System.out.println("|                  3- pelea                   |");
            System.out.println("|                  4- salir                   |");
            System.out.println(" ______________________________________________");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {

                case 1:
                    altamounstruo();
                    break;
                case 2:
                    altahumano();
                    break;
                case 3:
                    mostrarAtacantes();
                case 4:
                    datos();
                    break;
            }
        }
        while (opcion != 4);
    }

    public static void altahumano() {

        int opcionH;
        do {
            System.out.println(" ____________________________________________");
            System.out.println("|    elejiste un personaje del tipo humano   |");
            System.out.println("|          que tipo de humano quieres        |");
            System.out.println("|                1- guerrero                 |");
            System.out.println("|                  2- mago                   |");
            System.out.println("|           3- enlistar personajes           |");
            System.out.println("|         4- regresar al menu anterior       |");
            System.out.println("|                 5- salir                   |");
            System.out.println(" _____________________________________________");
            opcionH = Integer.parseInt(scan.nextLine());

            switch (opcionH) {

                case 1:
                    altaguerrero();
                    break;
                case 2:
                    altamago();
                    break;
                case 3:
                    listarpersonajes();
                    break;
                case 4:
                    suitch1();
                    break;
                case 5:
                    datos();
                    break;
            }
        }
        while (opcionH != 5);
    }

    public static void altaguerrero() {
        guerrero Guerrero = new guerrero();

        System.out.println("nombre: ");
        Guerrero.setNombre(scan.nextLine());

        System.out.println("poder: ");
        Guerrero.setPoder(scan.nextLine());

        System.out.println("sexo: ");
        Guerrero.setSexo(scan.nextLine());

        System.out.println("origen: ");
        Guerrero.setOrigen(scan.nextLine());

        System.out.println("edad: ");
        Guerrero.setEdad(scan.nextLine());

        System.out.println("vida: ");
        Guerrero.setVida(Integer.parseInt(scan.nextLine()));

        System.out.println("armas: ");
        Guerrero.setArma(scan.nextLine());

        System.out.println("debilidad: ");
        Guerrero.setDebilidad(scan.nextLine());

        Personaje.add(Guerrero);
    }

    public static void altamago() {
        mago Mago = new mago();

        System.out.println("nombre: ");
        Mago.setNombre(scan.nextLine());

        System.out.println("poder: ");
        Mago.setPoder(scan.nextLine());

        System.out.println("sexo: ");
        Mago.setSexo(scan.nextLine());

        System.out.println("origen: ");
        Mago.setOrigen(scan.nextLine());

        System.out.println("edad: ");
        Mago.setEdad(scan.nextLine());

        System.out.println("vida: ");
        Mago.setVida(Integer.parseInt(scan.nextLine()));

        System.out.println("armas: ");
        Mago.setArma(scan.nextLine());

        System.out.println("debilidad: ");
        Mago.setDebilidad(scan.nextLine());

        Personaje.add(Mago);
    }

    public static void altamounstruo() {
        int opcionM;
        do {
            System.out.println(" ________________________________________________ ");
            System.out.println("|    elejiste un personaje del tipo mounstruo    |");
            System.out.println("|          que tipo de mounstruo quieres         |");
            System.out.println("|                 1- zombie                      |");
            System.out.println("|                 2- lagarto                     |");
            System.out.println("|           3- listar personajes                 |");
            System.out.println("|         4- regresar al menu anterior           |");
            System.out.println("|                 5- salir                       |");
            System.out.println(" ________________________________________________ ");
            opcionM = Integer.parseInt(scan.nextLine());

            switch (opcionM) {

                case 1:
                    altazombie();
                    break;
                case 2:
                    altalagarto();
                    break;
                case 3:
                    listarpersonajes();
                    break;
                case 4:
                    suitch1();
                    break;
                case 5:
                    datos();
                    break;
            }
        }
        while (opcionM != 5);
    }

    public static void altazombie() {
        zombies Zombie = new zombies();

        System.out.println("nombre: ");
        Zombie.setNombre(scan.nextLine());

        System.out.println("sexo: ");
        Zombie.setSexo(scan.nextLine());

        System.out.println("origen: ");
        Zombie.setOrigen(scan.nextLine());

        System.out.println("edad: ");
        Zombie.setEdad(scan.nextLine());

        System.out.println("vida: ");
        Zombie.setVida(Integer.parseInt(scan.nextLine()));

        System.out.println("descendencia: ");
        Zombie.setDescendencia(scan.nextLine());

        Personaje.add(Zombie);
    }

    public static void altalagarto() {
        lagarto Lagarto = new lagarto();

        System.out.println("nombre: ");
        Lagarto.setNombre(scan.nextLine());

        System.out.println("sexo: ");
        Lagarto.setSexo(scan.nextLine());

        System.out.println("origen: ");
        Lagarto.setOrigen(scan.nextLine());

        System.out.println("edad: ");
        Lagarto.setEdad(scan.nextLine());

        System.out.println("vida: ");
        Lagarto.setVida(Integer.parseInt(scan.nextLine()));

        System.out.println("descendencia: ");
        Lagarto.setDescendencia(scan.nextLine());

        Personaje.add(Lagarto);
    }

    public static void listarpersonajes() {

        for (personaje Pobj : Personaje) {
            if (Pobj instanceof guerrero) {
                System.out.println("nombre: " + Pobj.getNombre());
                System.out.println("sexo: " + Pobj.getSexo());
                System.out.println("origen: " + Pobj.getOrigen());
                System.out.println("edad: " + Pobj.getEdad());
                System.out.println("vida: " + Pobj.getVida());
                System.out.println("armas: " + ((guerrero) Pobj).getArma());
                System.out.println("debilidad: " + ((guerrero) Pobj).getDebilidad());
                System.out.println(((guerrero) Pobj).que_esH());
                System.out.println(((guerrero) Pobj).tipoH1());
            }
            if (Pobj instanceof mago) {
                System.out.println("nombre: " + Pobj.getNombre());
                System.out.println("sexo: " + Pobj.getSexo());
                System.out.println("origen: " + Pobj.getOrigen());
                System.out.println("edad: " + Pobj.getEdad());
                System.out.println("vida: " + Pobj.getVida());
                System.out.println("armas: " + ((mago) Pobj).getArma());
                System.out.println("debilidad: " + ((mago) Pobj).getDebilidad());
                System.out.println(((mago) Pobj).que_esH());
                System.out.println(((mago) Pobj).tipoH2());
            }
            if (Pobj instanceof zombies) {

                System.out.println("nombre: " + Pobj.getNombre());
                System.out.println("sexo: " + Pobj.getSexo());
                System.out.println("origen: " + Pobj.getOrigen());
                System.out.println("edad: " + Pobj.getEdad());
                System.out.println("vida: " + Pobj.getVida());
                System.out.println("descendencia: " + ((zombies) Pobj).getDescendencia());
                System.out.println(((zombies) Pobj).que_esM());
                System.out.println(((zombies) Pobj).tipoM1());
            }
            if (Pobj instanceof lagarto) {
                System.out.println("nombre: " + Pobj.getNombre());
                System.out.println("sexo: " + Pobj.getSexo());
                System.out.println("origen: " + Pobj.getOrigen());
                System.out.println("edad: " + Pobj.getEdad());
                System.out.println("vida: " + Pobj.getVida());
                System.out.println("descendencia: " + ((lagarto) Pobj).getDescendencia());
                System.out.println(((lagarto) Pobj).que_esM());
                System.out.println(((lagarto) Pobj).tipoM2());
            }
            System.out.println("*****************************");
        }
        System.out.println("el arreglo tiene un tamaño total de: " + Personaje.size());
    }

    public static void mostrarAtacantes() {
        int x = 0, op, op2, vida1, vida2, ataque1, ataque2, Newvida1, Newvida2;
        char pelea;
        char confirmacion;

        for (personaje p : Personaje) {
            System.out.println(x + ".- " + p.getNombre());
            x++;
        }
        System.out.println("esta seguro de comenzar la pelea? [S/N]");
        pelea = scan.next().charAt(0);

        if (pelea == 's' || pelea == 'S') {

            do {
                System.out.println("Quien va a realizar su ataque: ");
                op = scan.nextInt();
                System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
                System.out.println("has seleccionado a:" + Personaje.get(op));
                System.out.println("cuantos puntos de vida tiene" + Personaje.get(op) + ":");
                vida1 = scan.nextInt();
                System.out.println("cuantos puntos quita el ataque de " + Personaje.get(op) + ":");
                ataque1= scan.nextInt();

                System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");

                System.out.println("contra quien va a realizar su ataque?");
                op2 = scan.nextInt();

                System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");

                System.out.println("has seleccionado a: " + Personaje.get(op2));
                System.out.println("cuantos puntos de vida tiene" + Personaje.get(op2) + ":");
                vida2=scan.nextInt();
                System.out.println("cuantos puntos quita el ataque de " + Personaje.get(op2) + ":");
                ataque2 = scan.nextInt();

                System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
                //realizo los calculos correspondientes
                Newvida2 = vida2-ataque1;
                Newvida1 = vida1-ataque2;

                System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
                System.out.println("despues de la pelea los peleadores quedaron de la siguiente manera");

                if(Newvida1>0){
                    System.out.println(Personaje.get(op)+" tiene "+Newvida1+" puntos de vida");
                }

                else{
                    System.out.println(Personaje.get(op) + " murio");
                }

                if(Newvida2>0){
                    System.out.println(Personaje.get(op2)+" tiene "+Newvida2+" puntos de vida");
                }

                else{
                    System.out.println(Personaje.get(op2)+" murio ");
                }

                System.out.println("quieres volver a pelear?");
                confirmacion = scan.next().charAt(0);

            } while (confirmacion == 's' || confirmacion == 'S');
        }
    }
    public static void datos() {
        System.out.println("<> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <>");
        System.out.println("<>          Programa Realizado por:          <>");
        System.out.println("<>                                           <>");
        System.out.println("<>        Roberto Carlos Lopez Perez         <>");
        System.out.println("<>               2do Semestre                <>");
        System.out.println("<>  Ingenieria en Sistemas Computacionales   <>");
        System.out.println("<>     Programacion Orientada a Objetos      <>");
        System.out.println("<> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <>");
    }
}