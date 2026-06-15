package Array.ArrayAlgorithm.Algorithm;

public class MorisVotingAlgo
{
    static int mostVote(int []nums){
        int can =0;
        int count=0;
        for(int num :nums){
            if(count==0){
                can =num;
            }
            if(num==can){
                count++;
            }
            else count--;
        }
        return can;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(mostVote(nums));
    }
}
