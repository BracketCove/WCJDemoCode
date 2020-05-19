package three.six;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static three.six.GameLogic.collectionHasRepeats;

public class SimpleJavaTest {
    public static void main(String[] args){
        checkForRepeatsTest();
    }

    /**
     * If each row, column, and 3x3 sub grid contain the numbers 1-9 without repeats,
     * then we have a valid, complete Sudoku grid.
     */
    private static void checkForRepeatsTest(){
        List<Integer> testListOne = Arrays.asList(1, 1, 2, 2, 2, 1, 1, 0);
        List<Integer> testListTwo = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        boolean testResultOne = collectionHasRepeats(testListOne);
        assert (testResultOne == true);

        //more concise to use:
        //assert testResultOne;

        boolean testResultTwo = collectionHasRepeats(testListTwo);
        assert (testResultTwo == false);

        //more concise to use:
        //assert !testResultTwo;

    }
}
