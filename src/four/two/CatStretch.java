package four.two;

public class CatStretch extends FlexibilityExercise {
    private final float angle;

    public CatStretch(String exerciseName, String duration, float angle) {
        super(exerciseName, duration);
        this.angle = angle;
    }

    public float getAngle() {
        return angle;
    }
}
