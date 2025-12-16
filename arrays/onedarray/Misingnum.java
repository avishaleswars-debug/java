import java.util.Arrays;

public class Misingnum {
     public static void main(String[] args) {
        // code here
        int arr[]={1,2,4};
        int num=1;
        Arrays.sort(arr);
       // int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                num++;
            }
            else if(num<arr[i]){
                
                break;
            }
        }
        System.out.println(num);
    }
}
