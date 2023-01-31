public class Index{
    public static void main(String args[]){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        int row = 7, i, j;
        for(i=1; i<=row; i++){
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}