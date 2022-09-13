class pattern8{
    public static void main(String args[]){
        int n=5;
        int number=1;
        //outer loop is considered as  row
        for(int i=1;i<=n;i++){
            // inner loop is considered as column
            for(int j=1;j<=i;j++){

                System.out.print(number+" ");
                number++;//number=number+1
            }
            System.out.println();

        }
    }
}