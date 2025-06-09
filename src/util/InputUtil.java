package util;

import java.util.Scanner;

public class InputUtil {
	// Scanner sebagai alat input dari user
    private static final Scanner scanner = new Scanner(System.in);

    //Method untuk membaca input bertipe String dari pengguna
    public static String inputString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    //Method untuk membaca input bertipe integer (bilangan bulat)
    public static int inputInteger(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka bulat.");
            }
        }
    }

    //Method untuk membaca input bertipe double (bilangan desimal)
    public static double inputDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka desimal.");
            }
        }
    }
}
