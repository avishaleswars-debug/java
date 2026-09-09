package Graph;
public class Numisland {
    public static void main(String[] args) {
        int[][] island={
        {1,1,0,1},
        {0,1,0,1},
        {1,0,0,1}};
        int n=island.length;
        int m=island[0].length;
       int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(island[i][j]==1){
            dfs(i,j,island);
            c++;
            }
        }
        }
        System.out.print(c);
    }
    static void dfs(int i,int j,int[][] arr){
         int[][] sum={{1,0},{-1,0},{0,-1},{0,1}};
         arr[i][j]=0;
         for(int[] k:sum){
            int a=k[0];
            int b=k[1];
            if(((a+i<arr.length&&a+i>=0)&&(b+j<arr[0].length&&b+j>=0))&&arr[i+a][j+b]==1)dfs(a+i,b+j,arr);
         }
    }
}
