package arrays.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
       int key=7;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==key){
                System.out.println("the key is at pos:"+i);
            }
        }
    }
}
