package Array.IIDArray;

public class SumDiagonal
{
    public static int sumdiagonal(int matrix[][]){
        int sum =0;
        int n =matrix.length;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(matrix[i]==matrix[j]){
                    sum += matrix[i][j];
                }
                else if (i+j==n-1){
                    sum+=matrix[i][j];
                }

            }
        }
        return sum ;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,4},{5,6,7},{9,4,6}};
        int res =sumdiagonal(matrix);
        System.out.println(res);
    }
}
