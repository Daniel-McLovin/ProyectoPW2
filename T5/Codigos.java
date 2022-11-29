
import java.util.Scanner;

/**
 *
 * @author Daniel Hz
 */
public class Codigos {

    public static void main(String[] args) {

        //Código para preguntar nombre
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);

        //Código para Suma de dos números
        int num1 = 5;
        int num2 = 10;
        int suma = num1 + num2;
        System.out.println(num1 + " + "
                + num2 + " es igual a " + suma);

        //Código AND
        if (num1 >= 0 && num2 >= 0) {
            System.out.println("Hay dos números mayores a cero");
        }
        //Código OR
        if (num1 >= 0 || num2 >= 0) {
            System.out.println("Hay un número (o dos) mayor a cero");
        }

        //Código NOT
        if (num1 == 5) {
            System.out.println("Son iguales: " + !false);
        }

        //Número del 1 al 10
        int numero3 = 8;
        int numero4 = 11;
        //Cuando es correcto
        if (numero3 > 10 || numero3 < 1) {
            System.out.println("Está mal, no coincide");
        } else {
            System.out.println(numero3 + "...Escogiste un buen número");
        }

        //Número incorrecto
        if (numero4 > 10 || numero4 < 1) {
            System.out.println(numero4 + "...Estás mal padrino");
        } else {
            System.out.println(numero3 + "...Escogiste un buen número");
        }

       
        //Adivinar el número del 1 al 10
        int a = (int) ((Math.random() * 10 + 1)); //Número aleatorio del 1 al 10 
        int b; //Número que pondrá el usuario 

        System.out.println("Adivina un número del 1 al 10");
        b = sc.nextInt();

        if (b > 10 || b < 1) {
            System.out.println(b + "No es un número válido, bye bye");
        } else {
            System.out.println(b + "...Escogiste un buen número");
            System.out.println("Vamos a ver si adivinaste :)");
            if (a == b) {
            System.out.println("Tu número es: " + b + "el mio es: ");
            System.out.println(a + "...Que acertivo");
            } else {
            System.out.println("Tu número es: " + b);
            System.out.println("No acertaste xd, el valor era:" + a);
        }

        }

    }
}
