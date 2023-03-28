package Ejercicios;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = {"", "", "", ""};

        for(int i = 0; i < nombres.length; i++){
            System.out.println(i+1 + ". Digite un texto: ");
            nombres[i] = scanner.nextLine();
        }

        for(int i = 0; i < nombres.length; i++){
            System.out.print(nombres[i] + " ");
        }
    }
}
