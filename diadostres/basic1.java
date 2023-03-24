package diadostres;

import java.util.Scanner;

public class basic1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingresar su nombre");

        String nombre = leer.nextLine();

        System.out.println("Hola " + nombre + "!");
    }
}
