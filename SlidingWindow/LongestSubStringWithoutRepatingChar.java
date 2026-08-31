package SlidingWindow;


import java.util.*;

public class LongestSubStringWithoutRepatingChar {
    public static void main(String[] args) {
        String str="aabcdefe";
         int max=0;
        /*LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            while (set.contains(str.charAt(i))) {
                Iterator<Character> it= set.iterator();
                it.next();
                it.remove();
            }
            set.add(str.charAt(i));
            max=Math.max(max,set.size());
        }
        System.out.println(max); */
        char[] arr=new char[26];
        int j=0;
        for(int i=0;i<str.length();i++){
            while(arr[str.charAt(i)-'a']!=0){
                arr[str.charAt(j)-'a']--;
                j++;
            }
            arr[str.charAt(i)-'a']++;
            max=Math.max(max,i-j+1);
        }
        System.out.println(max);
    }
}
