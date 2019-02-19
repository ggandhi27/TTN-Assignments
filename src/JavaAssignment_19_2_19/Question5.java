package JavaAssignment_19_2_19;

public class Question5 {
    public static void main(String[] args) {
        int a[] = {1,5,3,6,9,7,8};
        int b[] = {5,6,2,4};
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
