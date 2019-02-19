package JavaAssignment_19_2_19;

public class Question6 {
    public static void main(String[] args) {
        int arr[] = {2,1,2,1,5,3,5,4,9,4,9};
        int i;
        int num = arr[0];
        for(i=1;i<arr.length;i++){
            num = num^arr[i];
        }
        System.out.println("The unique number is "+num);
    }
}
