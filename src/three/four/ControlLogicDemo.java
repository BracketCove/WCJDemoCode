package three.four;

public class ControlLogicDemo {
    public static void main(String[] args) {

        int x = -10;
        int y = 5;

        boolean trueOrFalse = (x == y);

        largestAbsoluteValue(x, y);

        String text = "Oy, blin!";
        char predicate = 'b';

        nullSafeCountOccurrences(text, predicate);

        int powerOfTwo = 256;
        int notPowerOfTwo = -37;
        isPowerOfTwo(powerOfTwo);
        isPowerOfTwo(notPowerOfTwo);

        tryCatchDemo(text, predicate);
        tryCatchDemo(null, predicate);

        //Using what you know about try/catch, stop this program from crashing!
        tryCatchDemoThrow(null, predicate);
    }

    private static void tryCatchDemo(String text, char predicate) {
        try{
            int occurrences = 0;
            for (char c : text.toCharArray()) {
                if (c == predicate) occurrences++;
            }

            System.out.println(occurrences);
        } catch (Exception e){
            System.out.println(0);
        }
    }

    private static void tryCatchDemoThrow(String text, char predicate) throws NullPointerException {
            int occurrences = 0;
            for (char c : text.toCharArray()) {
                if (c == predicate) occurrences++;
            }

            System.out.println(occurrences);
    }

    private static void isPowerOfTwo(int x) {
        switch (x) {
            case 2:
                System.out.println("Yes, it is");
                break;
            case 4:
                System.out.println("Yes, it is.");
                break;
            case 8:
                System.out.println("Yes, it is.");
                break;
            case 16:
                System.out.println("Yes, it is.");
                break;
            case 32:
                System.out.println("Yes, it is.");
                break;
            case 64:
                System.out.println("Yes, it is.");
                break;
            case 128:
                System.out.println("Yes, it is.");
                break;
            case 256:
                System.out.println("Yes, it is.");
                break;
            case 512:
                System.out.println("Yes, it is.");
                break;

            default:
                System.out.println("It probably is not...");
        }
    }

    /**
     * Return the length of a String, but assume that the String may be null.
     * <p>
     * Note: Again... not trying to optimize (for demonstration purposes only)
     *
     * @param text
     */
    private static void nullSafeCountOccurrences(String text, char predicate) {
        // && means both statements must be true
        // || (OR) means at least one statement must be true
        if (text != null && text.length() != 0) {
            int occurrences = 0;
            for (char c : text.toCharArray()) {
                if (c == predicate) occurrences++;
            }

            System.out.println(occurrences);
        } else System.out.println(0);
    }

    /**
     * Absolute value of an integer represents its 'distance' from 0.
     * abs. value of 5 is 5
     * abs. value of -5 is also 5
     * <p>
     * Note: This code is obviously not optimized.
     */
    private static void largestAbsoluteValue(int x, int y) {
        int absX, absY;

        if (x < 0) absX = Math.abs(x);
        else absX = x;

        if (y < 0) {
            absY = Math.abs(y);
        } else {
            absY = y;
        }

        if (absX < absY) System.out.println("Y is largest abs");
        else if (absX > absY) System.out.println("X is largest abs");
        else System.out.println("abs values are equal");
    }
}
