package four.four;

/**
 * Note: This example has been simplified slightly to make the example easier!
 *
 * Problem: Most kinds of exercises share a lot of implementation (type, name, repetitions/time, weight lifted).
 * However, in order to give legible outputs to the use, different exercises need to implement different outputs.
 *
 * Example outputs for each type of exercise:
 * Barbell: 10 REPS @ 100 LBS
 * Dumbbell: 10 REPS @ 50 LBS x2
 * Bodyweight: 10 REPS @ Bodyweight
 * Bodyweight +: 10 REPS @ Bodyweight + 45 LBS
 * Timed: 60 SEC @ 100 LBS
 *
 *
 */
public abstract class AbstractExerciseStarter {
    private final String type;
    protected final String name;
    protected final int[] repetitionsOrTime;
    protected final double[] weight;
    //protected means these variables are visible within sub classes
    protected static final String POUNDS = "LBS";
    protected static final String SECONDS = "SEC ";
    protected static final String REPETITIONS = "REPS ";

    public AbstractExerciseStarter(String type, String name, int[] repetitionsOrTime, double[] weight) {
        this.type = type;
        this.name = name;
        this.repetitionsOrTime = repetitionsOrTime;
        this.weight = weight;
    }

    public String getFormattedOutput(){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("\n");
        getSetData(sb);
        sb.append("\n");
        return sb.toString();
    }

    protected abstract void getSetData(StringBuilder sb);

}
