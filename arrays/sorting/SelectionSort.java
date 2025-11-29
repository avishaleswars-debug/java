class SelectionSort{
    public static void main(String args[]){
        int arr[]={1,3,5,7,0,4,6};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<max){
                    min=arr[j];
                }
            }
            int temp=arr[i];
            arr[i]=min;
            min=temp;
        }
    }
}