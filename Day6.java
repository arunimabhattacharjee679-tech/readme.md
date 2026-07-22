import java.util.Scanner;
class B{
    public static void main(String[] args) {
        int[] arr={1,1,2,3,5,7,3,3};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max:"+max);
        System.out.println("min:"+min);
    }
}
