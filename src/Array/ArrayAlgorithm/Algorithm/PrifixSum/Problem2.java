package Array.ArrayAlgorithm.Algorithm.PrifixSum;
//Problem 2 : Equilibrium Index
//
//Given an array:
//        [1, 3, 5, 2, 2]
//
//Find the index where:
//
//Sum of all elements on left side = Sum of all elements on right side
//
//Output:
//        2
//
//Explanation:
//
//Left side of index 2:
//        1 + 3 = 4
//
//Right side of index 2:
//        2 + 2 = 4
//
//Both are equal, so answer = 2
public class Problem2 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 2};
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum = arr[i] + totalsum;
        }
        int leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightsum = totalsum - leftsum - arr[i];
            if (leftsum == rightsum) {
                System.out.println("Equilibrium Index = " + i);
                break;
            }
            leftsum = leftsum + arr[i];
        }

    }

}

