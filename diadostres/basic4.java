package diadostres;

import java.util.Scanner;

public class basic4 {
    public static void main(String[] args) {
        float grados;
        float conversion;
        System.out.println("Por favor ingrese grados Centigrados");

        Scanner leer = new Scanner(System.in);
        grados = (float) leer.nextFloat();

        conversion = 32 + (9 * grados / 5);

        System.out.println("Los grados Centigrados ingresados equivalen a " + conversion + " grados Farenheit");

    }
}
