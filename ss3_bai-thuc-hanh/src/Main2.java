public class Main2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,11,12,44,53,0};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("So lon nhat la: " + max);
    }
}
