package my.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int iA = scanner.nextInt();
        System.out.println("iA = " + iA);
    }
}
