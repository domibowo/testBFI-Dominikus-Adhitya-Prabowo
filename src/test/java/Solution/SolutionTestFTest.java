package Solution;

import Solution.TestF.City;
import Solution.TestF.SolutionTestF;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class SolutionTestFTest {

    @Test
    void searchSimilarCity_shouldReturnMoreThanOneCities_whenGivenRandomInput() throws IOException {
        SolutionTestF solutionTestF = new SolutionTestF();
        List<String> search = solutionTestF.searchSimilarCity("sisayang");

        assertTrue(search.size() > 0);

    }
}