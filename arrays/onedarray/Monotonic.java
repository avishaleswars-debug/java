package arrays.onedarray;
//check if the array is in the increasing or decreasing order
public class Monotonic{
    static boolean isMonotonic(int[] arr){
boolean increasing=true;
boolean decreasing=true;
for(int i=1;i<arr.length;i++){
    if(arr[i]>arr[i-1]) {
        decreasing=false;
    }
    if(arr[i]<arr[i-1]){ 
    increasing=false;
    }
}
return increasing || decreasing;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5};
        System.out.println(isMonotonic(arr));

    }
}