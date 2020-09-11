package Solution.TestD;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

class SolutionTestDTest {

    @Test
    void findHighestNegative_shouldReturnAMissingHighestNegativeNumber_betweenRandomNumber() {
        SolutionTestD testD = new SolutionTestD();
        HashMap<int[], Integer> tests = new HashMap<>();

        tests.put(new int[] { 3, 2, -5, 0 }, -1);
        tests.put(new int[] { 10, -1, -2, -3 }, -4);
        tests.put(new int[] { 100, 200, 300, -100, -200, -3, -1, -2, -4, 1000, -5 }, -6);
        tests.put(new int[] { 0, 2, 4, -1, -3, -4 }, -2);
        tests.put(new int[] { 3, 2, -5, -1, -2, 0 }, -3);

        tests.forEach((problem, solution) -> assertEquals(testD.findHighestNegative(problem), (int) solution));

    }
}