public class NumberSpiral {
   public static void main (String[] args){
        int x =2, y=2;
    if(y % 2 == 0){
        System.out.println((y*y)-(x-1));
    }else{
        System.out.println((y*y+1)+(x-1));
    }
}}