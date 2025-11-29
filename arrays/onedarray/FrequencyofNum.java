package arrays.onedarray;
//input 1123 output 0 2 1 1 0 0 0 0 0 0
public class FrequencyofNum {
    public static void main(String[] args) {
        int num=1123;
        int[] arr=new int[10];
        
        while(num!=0){
            
            int digit=num % 10;
            arr[digit]+=1;
            num=num/10;
        }
       for (int i : arr) {
        System.out.print(i+" ");
       }

    }
}
