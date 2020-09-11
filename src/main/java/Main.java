import Solution.TestD.SolutionTestD;
import Solution.TestF.SolutionTestF;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        SolutionTestF solutionTestF = new SolutionTestF();
//        List<String> cities = solutionTestF.searchSimilarCity("pulxu pqnjzng");
//        for(String city: cities){
//            System.out.print(city + ", ");
//        }
        SolutionTestD solutionTestD = new SolutionTestD();
        int[] arr = {0,10,2,-10,-20, -2,-3, -4, -1, -5};
        System.out.println(solutionTestD.findHighestNegative(arr));
    }
}
