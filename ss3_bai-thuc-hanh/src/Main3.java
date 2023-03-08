import java.sql.SQLOutput;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C, F;
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. C sang F");
            System.out.println("2. F sang C");
            System.out.println("0. EXIT");
            System.out.println("Nhap nhiet do can chuyen doi");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("nhap do F");
                    F = input.nextDouble();
                    System.out.println("Do C la: " + (F = (5.0 / 9) * (F - 32)));
                    break;
                }
                case 2: {
                    System.out.println("nhap do C");
                    C = input.nextDouble();
                    System.out.println("Do F la: " + (F = (9.0 / 5) * C + 32));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }
    }
}