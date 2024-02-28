public class question2 {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        int num1 = 0; 
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                num1+= matrix1[i][j];
            }
        }
        System.out.println("Total in the matrix is: " + num1);
    }
}