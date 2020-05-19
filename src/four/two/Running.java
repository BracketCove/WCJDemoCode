package four.two;

public class Running extends AerobicExercise {
    private final int pace;

    public Running(String exerciseName, String distance, int pace) {
        super(exerciseName, distance);
        this.pace = pace;
    }

    public int getPace() {
        return pace;
    }
}
