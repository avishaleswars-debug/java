package SlidingWindow;
import java.util.*;
public class FruitsBasket {
    


    public static void main(String[] args) {

        int[] fruits = {1, 2, 1, 2, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;
        int j = 0;

        for (int i = 0; i < fruits.length; i++) {

            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);

            while (map.size() > 2) {

                int k = j;
System.out.println(map);
                if (map.get(fruits[k]) == 0) {
                    map.remove(fruits[k]);
                }
System.out.println(map);
map.put(fruits[j], map.get(fruits[j]) - 1);
                    j++;
                
            }

            max = Math.max(max, i - j + 1);
        }

        System.out.println(max);
    }

}
