package Array.IIDArray;

public class SumDiagonalAd
{
    public static int sumdiagonal(int matrix[][]){
        int sum =0;
        int n =matrix.length;
        for(int i=0;i<matrix.length;i++){
            sum +=matrix[i][i];
            sum +=matrix[i][n -1-i];
        }
        if(n %2 ==1){
            sum-=matrix[n/2][n/2];
        }
        return sum ;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,4},{5,6,7},{9,4,6}};
        int res =sumdiagonal(matrix);
        System.out.println(res);
    }
}
