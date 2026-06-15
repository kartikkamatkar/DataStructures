package Array.ArrayAlgorithm;

public class SortColorCountingSort
{
    static int [] colorSort(int []nums){
        int a=0;
        int b=0;
        int c=0;
        for(int num :nums)
        {
            if(num==0){
                a++;
            }
            else if (num==1)
            {
                b++;
            }
            else {
                c++;
            }
        }
            int index=0;
            while (a>0){
                nums[index]=0;
                index++;
                a--;
            }
            while (b>0){
                nums[index]=1;
                index++;
                b--;
            }
            while(c>0){
                nums[index]=2;
                index++;
                c--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
       int res[]=colorSort(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(" "+res[i]);
        }
    }
}
