public class Main4 {
    public static void main(String[] args) {
        int[] arr = {324123,32512,647578,23421,56856,23521125};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("So nho nhat la: " + min);
    }
}
