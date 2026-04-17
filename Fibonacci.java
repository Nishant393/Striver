


public class Fibonacci{
    public static void series (int k) {
        int a = 0,b = 1;
        int t = 0 ;
        for(int i = 0 ; i <= k;i++){
            t = a + b ;
            System.out.print(t+", ");
            a=b;
            b=t;
        }
    }
    public static void main(String[] args) {
        int n=10;
        series(n);
    }
}
