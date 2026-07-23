import java.util.Scanner;
class B{
    public static void main(String[] args) {
        int[] arr={1,2,2,5,4,2};
        String str="madam";
        char rev=str.charAt(0);
        char original=str.charAt(0);
        for(int i=0;i<str.length();i++){
            original=str.charAt(i);
            System.out.print(original);
        }
        for(int i=str.length()-1;i>=0;i--){
            rev=str.charAt(i);
            System.out.print("\n"+rev);
        }
        for(int i=0;i<str.length();i++){
            if(rev==original){
                System.out.println("\npalindrome");
                return;
            }
            else{
                System.out.println("\nnot palindrome");
                return;
            }
         }
            int upper=0;
            int lower=0;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.println(ch+":Uppercase");
                upper+=1;
            }
            else{
                System.out.println(ch+":lowercase");
                lower+=1;
             }
        }
        System.out.println("upeer case:"+upper);
        System.out.println("lower case:"+lower);
    }
}
