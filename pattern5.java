class pattern5{
    //method
    public static void main(String args[]){
        int n = 4;
        //outer loop
        for( int i=1;i<=n;i++){
            //inner loop1->space print
            for(int j=1;j<=n-i;j++){
            System.out.print(" ");
            }
            //inner loop2-> * print
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }

            System.out.println("");

        }
    }
}