package arrays.onedarray;

public class Trappingwater {
    public static void main(String args[]){
    int[] arr={1,0,3,4,0,1,5,0};
    int left=0;
    int n=arr.length;
    int right=n-1;
    int leftmax=0;
    int rightmax=0;
    int water=0;
    while(left<right){
        if(arr[left]<arr[right]){
if(arr[left]>leftmax){
    leftmax=arr[left];
}
else{
    water=water+leftmax-arr[left];
}
left++;
        }
else{
if(arr[right]>leftmax){
    rightmax=arr[right];
}
else{
    water=water+rightmax-arr[right];
}
right--;
}
        
    }
    System.out.println(water);
}
}