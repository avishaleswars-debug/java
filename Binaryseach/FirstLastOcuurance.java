package Binaryseach;

public class FirstLastOcuurance {
    public static void main(String[] args) {
        int l=0;
        int r=arr.length;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                int ans=mid;
                r=mid-1;

            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
    }
}
