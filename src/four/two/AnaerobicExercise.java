package four.two;
class AnaerobicExercise extends Exercise {
    protected final String repetitions;
    private static final String EXERCISE_TYPE
            = "Anaerobic";


    public AnaerobicExercise(String exerciseName,
                             String repetitions) {
        super(EXERCISE_TYPE, exerciseName);
        this.repetitions = repetitions;
    }
}













