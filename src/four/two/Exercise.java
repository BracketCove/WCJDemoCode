package four.two;


/**
 * Base/Root class
 */
class Exercise {
    protected final String exerciseType;
    protected final String exerciseName;

    public Exercise(String exerciseType,
                    String exerciseName) {
        this.exerciseType = exerciseType;
        this.exerciseName = exerciseName;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public String getExerciseName() {
        return exerciseName;
    }
}
