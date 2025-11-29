package arrays.onedarray;
//check if the array is first increase then decrease
public class Biotonic{
    static boolean isBiotonic(int[] arr) {
int increasing=0;
int decreasing=0;
for(int i=1;i<arr.length;i++){
    if(arr[i]>arr[i-1]) {
        increasing++;
    }
    
}
    for(int j=increasing-1;j<increasing-arr.length;j++){
        if(arr[j]<arr[j-1]){
            decreasing++;
        }
        }
        boolean a=false;
    if(increasing+decreasing==arr.length)
 a=true;
return a;
}
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        System.out.println(isBiotonic(arr));
    }
}
//not