package Array.IIDArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FlippedImage
{
    public static int [][] flippedimage(int [][]image)
    {
        for(int i =0;i<image.length;i++){
            int left =0;
            int right= image[0].length-1;
            while (left<=right){
                int temp=image[i][left];
                image[i][left]=image[i][right];
                image[i][right]=temp;
                left++;
                right--;
            }
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int res [][]=flippedimage(image);
        for(int [] i :res)
        {
            System.out.println(Arrays.toString(i));
        }
    }
}
