package JavaAssignment_21_2_19;

public class Question2 {
    
    public static void mergeSort(char arr[],int p,int r){
        
        if(p<r) {
    
            int q;
            q = (int) ((p + (r - p) / 2));
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }
    
    private static void merge(char[] arr,int p,int q,int r) {
        int left,right;
        left = (q-p)+1;
        right = (r-q);
        
        char l1[] = new char[left];
        char l2[] = new char[right];
        
        int i,j;
        
        for(i=0;i<left;i++){
            l1[i] = arr[i+p];
            
        }
        for(i=0;i<right;i++){
            l2[i] = arr[i+1+q];
        }
        
        i = 0;
        j = 0;
        int k = p;
        while(i<left && j<right){
            
            if(l1[i]<=l2[j]){
                arr[k++] = l1[i++];
            }
            else{
                arr[k++] = l2[j++];
            }
            
        }
        
        while(i<left){
            arr[k++] = l1[i++];
        }
    
        while(j<right){
            arr[k++] = l2[j++];
        }
    
    
    }
    
    public static void main(String[] args) {
        String str="To The New";
        
        char charArr[] = str.toCharArray();
        
        mergeSort(charArr,0,charArr.length-1);
    
        System.out.print("Sort String is :: ");
        str="";
        for(int i=0;i<charArr.length;i++){
            str+=charArr[i];
        }
        System.out.println(str);
    }
}
