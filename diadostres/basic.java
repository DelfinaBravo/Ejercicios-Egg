package diadostres;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        int numero;
        int numero1;
        int sumar;
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingresar dos numeros enteros distintos");

        numero = (int) leer.nextLong();
        numero1 = (int) leer.nextLong();
        sumar = numero + numero1;

        System.out.println("La suma de los numeros es " + sumar);

    }
}
