package four.four;

class BodyweightExercise extends AbstractExercise {
    private static final String BODYWEIGHT = "Bodyweight";

    public BodyweightExercise(String type, String name, int[] repetitionsOrTime, double[] weight) {
        super(type, name, repetitionsOrTime, weight);
    }

    @Override
    protected void getSetData(StringBuilder sb) {
        for (int i = 0; i < repetitionsOrTime.length; i++) {
            sb.append(repetitionsOrTime[i]);
            sb.append(" ");
            sb.append(REPETITIONS);
            sb.append(" @ ");
            sb.append(BODYWEIGHT);
            sb.append("\n");
        }
    }
}
