import java .util.*;
// import java.util.*;
// import java.util.ArrayList;
// import java.utils.*;


public class TwoSets {

    public static void main(String[] args) {
        int n = 7;

        List<Integer> set1 =  new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();

        int target = (n*(n+1)/2)/2;
        System.out.println(target);
        if (n % 2 == 0) {
            System.out.println("NO");
        } else {
          for(int i =n ; i>=1;i--){
           if( target >= i ){
            set1.add(i);
            target -=i;
           }
           else{
            set2.add(i);
           }
          }
        }
        System.out.println(set1 + " " + set2);
    }
}
