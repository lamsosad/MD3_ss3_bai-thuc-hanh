import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int number;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("nhap so hoc sinh can nhap diem vao day: ");
            number = input.nextInt();
            if (number > 30)
                System.out.println("diem khong qua 30");
        } while (number > 30);
        array = new int[number];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhap diem cho hoc sinh "+(i+1)+"(10/10): ");
            array[i]=input.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("danh sach diem la: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
            if (array[j]>=5&&array[j]<=10){
                count++;
            }
        } System.out.println("\n so hoc sinh thi do la: "+count);
    }
}
