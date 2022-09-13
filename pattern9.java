class pattern9{
    public static void main(String args[]){
        int n=5;
        
        //outer loop is considered as  row
        for(int i=1;i<=n;i++){
            // inner loop is considered as column
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");

                } 
                else{
                    System.out.print(("0 "));
                }           
            }
            System.out.println();

        }
    }
}