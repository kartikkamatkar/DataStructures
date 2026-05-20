package Array.IIDArray;

public class TransposeMatrix
{
    public static int [][] transpose(int [][]matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        int transpose[][]=new int [col][row];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int res[][]=transpose(matrix);
        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();

        }


    }
}
