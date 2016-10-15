package my.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iRange = 10;
        int iNumber = (int)(Math.random() * iRange);
        while (true) {
            System.out.println("Угадай число от 0 до " + iRange);
            int iNumberUser = scanner.nextInt();
            if (iNumber == iNumberUser) {
                System.out.println("Угадал число!");
                break;
            } else {
                System.out.println("Не угадал число!");
            }
        }
        scanner.close();
    }
}
