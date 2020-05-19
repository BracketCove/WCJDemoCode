package four.four;

abstract class AbstractExercise {
    private final String type;
    protected final String name;
    protected final int[] repetitionsOrTime;
    protected final double[] weight;

    protected static final String POUNDS = "LBS";
    protected static final String SECONDS = "SEC ";
    protected static final String REPETITIONS = "REPS ";

    public AbstractExercise(String type, String name, int[] repetitionsOrTime, double[] weight) {
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

    /**
     * Append data appropriately based on Exercise type
     * @param sb - StringBuilder to Append data to
     */
    protected abstract void getSetData(StringBuilder sb);

    //...Getters
}
