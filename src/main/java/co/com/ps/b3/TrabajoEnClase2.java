package co.com.ps.b3;
import java.util.Scanner;

// Calculadora por consola - impresion
public class TrabajoEnClase2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Calculadora por consola para dos números");

        System.out.print("Ingrese el primer número--> ");
        double num1=scanner.nextDouble();

        System.out.print("Ingrese el segundo número--> ");
        double num2=scanner.nextDouble();

        menu();
        int opcion=scanner.nextInt();

        //switch para el menu de la calculadora.
        switch (opcion){
            case 1:
                resultado("La suma es--> ",num1+num2);
                break;
            case 2:
                resultado("La resta es--> ",num1-num2);
                break;
            case 3:
                resultado("La multiplicación es--> ",num1*num2);
                break;
            case 4:
                resultado("La división de los números es: ",num1/num2);
                break;
        }
        scanner.close();
    }
    private static void menu(){
        System.out.println("Selecciona la opción que desea realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
    }
    private static void resultado(String operacion, double resul){
        System.out.println("El resultado de la "+ operacion + " es--> " + resul);
    }

}
