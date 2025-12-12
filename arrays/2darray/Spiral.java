public class Spiral {
public static void main(String[] args) {
    int[][] arr={{1,2,3,30},{4,5,6,60},{7,8,9,90},{10,11,12,13}};
    int top=0;
    int bottom=arr.length-1;
    int left=0;
    int right=arr[0].length-1;
    while (right>=left && bottom>=top) {
        for(int i=left;i<=right;i++){
System.out.print(arr[top][i]+" ");
        }
        top++;
        for(int i=top;i<=bottom;i++){
            System.out.print(arr[i][right]+" ");
        }
        right--;
   if (top <= bottom) {

        for(int i=right;i>=left;i--){
            System.out.print(arr[bottom][i]+" ");
        }
        bottom--;
   }
    if(right>=left){
        for(int i=bottom;i>=top;i--){
            System.out.print(arr[i][left]+" ");
        }
        left++;
   }
    }
}
}
