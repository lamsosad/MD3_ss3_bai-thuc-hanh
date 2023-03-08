import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Lam", "Tuan", "Khoa", "Minh"};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = input.nextLine();
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(name)) {
                System.out.println("Thang " + name + " nay dang o vi tri so "+(i+1));
                check=true;
                break;
            }
        }
        if (!check){
            System.out.println("Thang" + name + "nay ko co trong danh sach ");
        }
    }
}