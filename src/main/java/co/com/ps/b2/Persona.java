package co.com.ps.b2;

public class Persona {

    String colorPiel;
    int edad;
    float estatura;
    String nombre;
    String id;
    String telefono;
    String deporte;
    String profesion;

    //Definición de un método
    public static void cantar() {
        System.out.println("Estoy cantando");
    }

    public void bailar(){
        System.out.println("Estoy bailando");
    }

    public int caminar(int cuadras){
        /*int pisadasPorCuadra = cuadras * 100;
        return pisadasPorCuadra;*/
        return cuadras * 100;
    }

    Persona(){

    }


    //Creamos el constructor Persona - instanciado en persona1
    Persona (String nombre1, int edad1, String id1, float estatura1, String deporte1, String profesion1 ){
        this.nombre = nombre1;
        this.edad = edad1;
        this.id = id1;
        this.estatura = estatura1;
        this.deporte = deporte1;
        this.profesion = profesion1;
    }


}
