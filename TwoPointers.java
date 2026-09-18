public class TwoPointers{


    public static void  main( String args[]){
        String str = "A man, a plan, a canal@#$: Panama";

        String newStr = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(newStr.toLowerCase());
    }
}