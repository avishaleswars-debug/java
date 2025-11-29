package arrays.onedarray;
public class BesttimetoBuy {
    public static void main(String[] args) {
        int arr[]={7,4,-1,-2,1,4,5};
        int minPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int price : arr) {
            if(price<minPrice){
                minPrice=price;
            }
            else{
            int profit=price-minPrice;
            if(profit>maxprofit) {
                maxprofit=profit;
            }
            }
        }
        System.out.println(maxprofit);
    }
}
