package four.two;

public class Walking extends AerobicExercise {
    private final float strideLength;

    public Walking(String exerciseName, String distance, float strideLength) {
        super(exerciseName, distance);
        this.strideLength = strideLength;
    }

    public float getStrideLength() {
        return strideLength;
    }
}
