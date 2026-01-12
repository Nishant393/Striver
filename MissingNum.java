class Algorithm{
    public int sum(int[] arr){
        int sum=0;
        for(int i : arr){
            sum =sum+ i;
        }
        return sum ;
    }

    public int sumNum(int n ){
        int sum = 0;
        for(int i = 0 ; i <= n ; i++ ){
            sum = sum + i ;
        }
        return sum;
    }

    public void algo( int n , int[] arr){
        System.out.println("missing num is " + (sumNum(n) - sum(arr)) );
    } 

}

public class MissingNum {
    public static void main(String[] args){
        Algorithm al = new Algorithm();
        int[] arr = { 2,3,1,5,4,7 };
        al.algo( 7 , arr );
    }
}