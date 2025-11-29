package arrays.onedarray;
//remove duplicates
public class RemoveDuplicates{
public static void main(String[] args) {
int[] arr={1,2,2,3,4,4,55,55};
int write=1;
for (int i = 1; i < arr.length; i++) {
    if(arr[i]!=arr[i-1]){
        arr[write]=arr[i];
        write++;
    }
}
for(int i=0;i<write;i++){
    System.out.print(arr[i]);
}
}
}
