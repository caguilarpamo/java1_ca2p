package co.com.ps.b2;

public class Main {
    public static void main(String[] args) {
        //creo objeto tipo persona
        Persona persona = new Persona();

        persona.nombre = "Christian";
        persona.edad = 35;
        persona.id = "123456789";
        persona.estatura = 1.78f;
        persona.deporte = "futbol";
        persona.profesion = "medico";

        persona.caminar(3);
        persona.bailar();

        System.out.println("persona.nombre--> " + persona.nombre);
        System.out.println("persona.caminar--> " + persona.caminar(3));

        //Ahora, para manejar la información con un constructor, creado en la clase Persona, se puede hacer:
        Persona persona1 = new Persona("Andrés",35,"987654321",1.80f,"futbol","medico");
        Persona persona2 = new Persona("Armando",36,"9876543212",1.81f,"futbol","medico");
        Persona persona3 = new Persona("Paredes",37,"987654323",1.82f,"futbol","medico");
        Persona persona4 = new Persona("Elma",38,"9876543214",1.83f,"futbol","medico");
        Persona persona5 = new Persona("Chacon",39,"9876543215",1.84f,"futbol","medico");
        Persona persona6 = new Persona("Bustos",40,"987654326",1.85f,"futbol","medico");
        Persona persona7 = new Persona("Benito",41,"987654327",1.86f,"futbol","medico");
        Persona persona8 = new Persona("Christian",42,"987654328",1.87f,"futbol","medico");
        Persona persona9 = new Persona("Aguilar",43,"9876543219",1.88f,"futbol","medico");

        System.out.println("Imprimir constructor Persona-->" + persona1.nombre);

    }
}
