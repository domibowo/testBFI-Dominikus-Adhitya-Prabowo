package Solution.TestD;

public class SolutionTestD {

    public int findHighestNegative(int[] arr) {
        int missingNegative = -1;
        while(true){
            for (int i = 0; i < arr.length; i++){
                if (missingNegative == arr[i]){
                    break;
                } else if (i == arr.length - 1 ){
                    if (missingNegative != 0) {
                        return missingNegative;
                    }
                }
            }
            missingNegative--;
        }
    }
}
