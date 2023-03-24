package diadostres;

import java.util.Scanner;

public class basic3 {
    public static void main(String[] args) {

        int numero;
        int triple;
        int doble;
        float raiz;
        System.out.println("Por favor ingresar un numero entero");

        Scanner leer = new Scanner(System.in);
        numero = (int) leer.nextInt();
        triple = numero * 3;
        doble = numero * 2;
        raiz = (float) Math.sqrt(numero);

        System.out.println("El doble del numero ingresado es: " + doble);
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);

    }
}
