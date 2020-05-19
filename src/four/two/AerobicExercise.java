package four.two;

class AerobicExercise extends Exercise {
    protected final String distance;
    private static final String EXERCISE_TYPE = "Aerobic";

    public AerobicExercise(String exerciseName,  String distance) {
        super(EXERCISE_TYPE, exerciseName);
        this.distance = distance;
    }
}