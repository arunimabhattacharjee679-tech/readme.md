class A{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] arr2={4,5,3,3,8,9};
        boolean same=true;
        if(arr.length!=arr2.length){
            same=false;
        }
        if(same){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
