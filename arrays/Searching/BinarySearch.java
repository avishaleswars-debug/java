package arrays.Searching;

public class BinarySearch {
    public static void main(String[] args) {
    int[] arr={1,2,4,5,6};
    int low=0;
    int high=arr.length-1;
    int mid=0;
    int key=5;
    while(true){
         mid=low+(high-low)/2;
if(arr[mid]==key){
    break;
}
else if(mid<key){
low=mid+1;
}
else{
    high=mid-1;
}
    }
    System.out.println(mid);
}
}