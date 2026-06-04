package Array.ArrayAlgorithm.Algorithm.Kadanes;

public class MAXSUBARRAY
{
    static int maxSubarray(int [] array){
        int current=0;
        int sum =array[0];
        for (int i = 0; i < array.length ; i++) {
            current +=array[i];
            sum =Math.max(current,sum);
            if(current<0){
                current=0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] array={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(array));
    }
}
