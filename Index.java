public class Index{
    public static void main(String args[]){
        int row = 7, i, j;
        for(i=1; i<=row; i++){
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}