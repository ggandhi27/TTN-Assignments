package JavaAssignment_19_2_19;

public class Question6 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 3, 1};
        int i;
        int num = arr[0];
        for(i=1;i<arr.length;i++){
            num = num^arr[i];
        }
        System.out.println("The unique number is "+num);
    }
}
