
public class PalindromeReorder {

    public static void main(String[] args) {
        String str = "AAAACACBA";
        int n = str.length()-1;
        int[] freq  = new int[26] ;
        int odd = 0,even=0;
        int oddChar =-1 ;
        String l ="" ,r="",m="";

        for(int i =0 ; i<= n;i++){
            freq[str.charAt(i) -'A']++;
        }
// frequency check up
        for(int i :freq){
            if(i!=0){
                if(i%2 ==0){
                    even++;
                }else{
                    odd++;
                    oddChar= i;
                }
            }
        }
        System.err.println(odd);
        if(odd >= 1){
            System.out.println("possible");
            //  left
            for(int i =0;i<26; i++ ){
                for(int  j=0 ; j<freq[i]/2 ;j++)
                {
                    l += (char)('A' + i);
                }
            }

            l += (char)('A' + oddChar);
            System.err.println(l);
        }else{
            System.out.println("NOT POSIBlE");
        }
    }
}
