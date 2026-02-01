
// import java.utils.*;


public class TrailingZeros {

    public static void main(String[] args) {
        long n = 20;
        long fact = 1;
        int count = 0;

        for(int i=1;i<=n;i++){
            fact = fact*i;
            System.out.println(i);
        }
        System.out.println(fact);
        int[] arr = Long.toString(fact).chars().map(c -> c - '0').toArray();
        // int[] charArray = fact.toArray();

        for(int i =0 ;i<arr.length-1;i++){
                System.out.println(i+" ,"+arr.length);
            if(arr[i]==0){        

                if(arr[i] == arr[i+1]){
                    count += 1;
                }
                else{
                    count =0;
                }
            }
        }
        System.out.println(count);

    }
}
