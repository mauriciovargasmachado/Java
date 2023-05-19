public class Main {
    public static void main(String[] args) {

        int matrix [][]={{1,1,1,1,1},{1,0,0,0,1},{1,0,0,0,1},{1,0,0,0,1},{1,1,1,1,1}};
        int a[][]=new int[5][5];


        System.out.println("This is the test array: ");
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("This is the array created by a for loop: ");

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                if (j==0 || i==4){
                    a[i][j]=1;
                }
                else if(j==0 || i==4){
                    a[i][j]=1;
                }
                else{
                    a[i][j]=0;
                }

                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}