class pattern4{
    //method
    public static void main(String args[]){
        int n = 1;
        //outer loop
        for( int i=4;i>=n;i--){
            //inner loop
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println("");

        }
    }
}