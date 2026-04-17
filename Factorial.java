


public class Factorial{
    public static int series (int k) {
        int t = 1;
        for(int i = 1 ; i <= k;i++){
            t = t * i;
        }
        return t;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(series(n)+" ");
    }
}
