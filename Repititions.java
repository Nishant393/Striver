class Algorithm{
    public void algo( String n ){
        int max =1 ; 
        int max_max = 1;
        char[] charArray = n.toCharArray();
        System.out.println(charArray.length);

        for(int i = 0 ; i < charArray.length -1; i++){
                // System.out.println(charArray[i] +" "+ charArray[i++]);
            if(charArray[i] == charArray[i+1] ){

               max = max + 1;
            }
            else {
                max = 1;
            }
            max_max = Math.max(max  , max_max) ;
        }
        System.out.println(max_max+" max number");
    } 
}

public class Repititions {
    public static void main(String[] args){
        Algorithm al = new Algorithm();
        al.algo("AAVVLLLLCCCTTT");
    }
}