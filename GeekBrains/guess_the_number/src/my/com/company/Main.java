package my.com.company;

import java.util.Scanner;

public class Main {

    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int iRange = 10;
        int iNumber = (int)(Math.random() * iRange);
        playLevel(iRange, iNumber);
        scanner.close();
    }

    private static void playLevel(int iRange, int iNumber) {
        while (true) {
            System.out.println("Угадай число от 0 до " + iRange + "(" + iNumber + ")");
            int iNumberUser = scanner.nextInt();
            if (iNumber == iNumberUser) {
                System.out.println("Угадал число!");
                break;
            } else if (iNumber < iNumberUser) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("Загаданное число больше!");
            }
        }
    }
}
