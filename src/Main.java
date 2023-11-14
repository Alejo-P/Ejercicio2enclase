
import java.util.Scanner;  //Permite ingresar datos

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!"); //Imprimir en consola

        System.out.println("Lista de numeros impares"); //Imprimir en consola
        // bucle for
        for (int i = 100; i >= 1; i--) {
            if (i%2!=0) {
                System.out.println("i = " + i);
            }
        }

        Scanner variable=new Scanner(System.in); //definir variable de ingreso de datos
        System.out.println("Ingrese un nombre: ");
        String nombre=variable.nextLine(); //Ingreso de valores por el usuario, similar a un cin
        System.out.println("El nombre es: "+nombre); //Imprimir en consola

        //Definir variables
        int a=0;
        int b=2;
        Scanner variable2=new Scanner(System.in); //para enteros
        System.out.println("Ingrese un numero entero:");
        a=variable2.nextInt();
        System.out.println("el numero a es: "+a);
        int suma=a+b;
        b=variable2.nextInt();
        System.out.println("el numero a es: "+b);
        System.out.println("la suma es: "+suma);
    }
}