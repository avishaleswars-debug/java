class Palindrome{
    public static void main(String[] args) {
        String str="malayalam";
      
     int i=0;
     boolean palin=false;
        int n=str.length()-1;
        while (n/2>0) {
         if( str.charAt(i++)==str.charAt(n--)){
            palin=true;
         }
           else{
            palin=false;
           }
        } 
        System.out.println(palin);
    }
}