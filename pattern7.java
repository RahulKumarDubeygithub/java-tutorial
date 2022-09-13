class pattern7{
    public static void main(String args[]){
        int n=5;
        int m=5;
        //outer loop is considered as  row
        for(int i=1;i<=n;i++){
            // inner loop is considered as column
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}