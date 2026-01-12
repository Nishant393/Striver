import java.util.Arrays;

class Algorithm{
    public int call(int n) {
        int i = 0;
        while(n != 1){
            if(n % 2 == 0 ){
                n = n / 2;
                System.out.print(n+"=>");
            }
            else{
                n = (n * 3 )+1;
                System.out.print(n + "=>");
            }
            i++;
        }
        return n;

        
    }
};


public class WeirdAlogorithm {
    public static void main(String[] args)
    {
        Algorithm algo = new Algorithm();
        algo.call(3);

        System.out.println("Hello, World");
    }
}