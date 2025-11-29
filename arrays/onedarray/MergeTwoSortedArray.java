package arrays.onedarray;
//using selection sort
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6,8};
        int j=arr2.length;
     int n=arr1.length+arr2.length;
        int[] merge=new int[n];
      
for(int i=0;i<n/2;i++){
    merge[i]=arr1[i];
    merge[arr1.length+i]=arr2[i];
}
int i=0;

while(i!=n){
    if(merge[i]>merge[j]) {
        int temp=merge[i];
        merge[i]=merge[j];
        merge[j]=temp;
        i++;
        if(j!=n-1){
            j++;
        }
    }
  else{
    i++;
  } 
}
for (int p : merge) {
    System.out.print(p+" ");
}
    }
}
//not