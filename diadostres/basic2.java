package diadostres;

import java.util.Scanner;

public class basic2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese una frase y la convertire de minuscula y mayuscula");

        String frase = leer.nextLine();

        System.out.println("Su frase en minuscula se ve asi:" + frase.toLowerCase());
        System.out.println("Su frase en mayuscula se ve asi:" + frase.toUpperCase());

    }
}
