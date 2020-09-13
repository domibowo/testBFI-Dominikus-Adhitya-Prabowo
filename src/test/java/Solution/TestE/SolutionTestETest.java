package Solution.TestE;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTestETest {

    @Test
    void mask_shouldSuccessfullyHideString_betweenTwoCharactersInAWord() {
        SolutionTestE testE = new SolutionTestE();
        HashMap<String, String> tests = new HashMap<>();

        tests.put("Tony Stark", "T**y S***k");
        tests.put("Peter Parker", "P***r P****r");
        tests.put("Bumblebee", "B*******e");
        tests.put("El Taurino", "El T*****o");
        tests.put("John Doe", "J**n D*e");
        tests.put("Crazy Rich Asian", "C***y R**h A***n");
        tests.put("Stephen Strange", "S*****n S*****e");
        tests.put("A Kid With Supernatural Abilities", "A K*d W**h S**********l A*******s");

        tests.forEach((original, masked) -> assertEquals(masked, testE.mask(original)));
    }
}