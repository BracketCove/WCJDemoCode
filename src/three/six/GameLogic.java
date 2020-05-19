package three.six;

import java.util.Collections;
import java.util.List;

 class GameLogic {

    static boolean collectionHasRepeats(List<Integer> collection) {
        //count occurrences of integers from 1-GRID_BOUNDARY. If Collections.frequency returns a value greater than 1,
        //then the square is invalid (i.e. a non-zero number has been repeated in a square)
        for (int index = 1; index <= 9; index++) {
            if (Collections.frequency(collection, index) > 1) return true;
        }

        return false;
    }
}
