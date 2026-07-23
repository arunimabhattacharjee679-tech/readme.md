import java.util.Scanner;
class B{
    public static void main(String[] args) {
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
    }
}
