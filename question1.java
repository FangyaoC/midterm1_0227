public class question1 {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int num = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                num += matrix[i][j];
            }
        }
        
        System.out.println("Total in the matrix is: " + num);
    }
}