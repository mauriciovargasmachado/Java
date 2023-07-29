public class Main {
    public static void main(String[] args) {

        int matrix_1 [][]=new int[3][3];
        int matrix_2 [][]=new int[3][3];
        int matrix_result [][]=new int[3][3];

        // matrix one
        for(int i=0;i<matrix_1.length;i++){
            for(int j=0; j<matrix_1.length;j++){
                matrix_1[i][j]= (int)(Math.random()*9);
            }
        }

        // matrix two
        for(int i=0;i<matrix_2.length;i++){
            for(int j=0; j<matrix_2.length;j++){
                matrix_2[i][j]= (int)(Math.random()*9);
            }
        }

        // matrix result
        for(int i=0;i<matrix_result.length;i++){
            for(int j=0; j<matrix_result.length;j++){
                matrix_result[i][j]= matrix_1[i][j]+matrix_2[i][j];
            }
        }

        // printing matrix_1
        for(int i=0;i<matrix_1.length;i++){
            for(int j=0; j<matrix_1.length;j++){
                System.out.print("[ "+matrix_1[i][j]+" ]");
            }
            System.out.println("");
        }

        System.out.println("  +  ");

        // printing matrix_2
        for(int i=0;i<matrix_2.length;i++){
            for(int j=0; j<matrix_2.length;j++){
                System.out.print("[ "+matrix_2[i][j]+" ]");
            }
            System.out.println("");
        }

        System.out.println("  = ");

        // printing matrix_result
        for(int i=0;i<matrix_result.length;i++){
            for(int j=0; j<matrix_result.length;j++){
                System.out.print("[ "+matrix_result[i][j]+" ]");
            }
            System.out.println("");
        }

        System.out.println("**********");
        System.out.println("");
        System.out.println("");

        // Horizontal printing of the matriz
        for(int i=0;i<matrix_1.length;i++){

            for(int j=0; j<matrix_1.length;j++){
                System.out.print("[ "+matrix_1[i][j]+" ]");
            }

            if(i==1){
                System.out.println("     +     ");
            }else{
                System.out.println("           ");
            }


            for(int j=0; j<matrix_2.length;j++){
                System.out.print("[ "+matrix_2[i][j]+" ]");
            }

            if(i==1){
                System.out.println("     =     ");
            }else{
                System.out.println("           ");
            }


            for(int j=0; j<matrix_result.length;j++){
                System.out.print("[ "+matrix_result[i][j]+" ]");
            }

            System.out.println("");
        }


    }
}