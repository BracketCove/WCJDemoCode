package four.two;

class FlexibilityExercise extends Exercise {
    protected final String duration;
    private static final String EXERCISE_TYPE = "Flexibility";


    public FlexibilityExercise(String exerciseName, String duration) {
        super(EXERCISE_TYPE, exerciseName);
        this.duration = duration;
    }
}

