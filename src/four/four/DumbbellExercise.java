package four.four;

class DumbbellExercise extends AbstractExercise {
    private static final String TIMES_TWO = "x2";

    public DumbbellExercise(String type, String name, int[] repetitionsOrTime, double[] weight) {
        super(type, name, repetitionsOrTime, weight);
    }

    @Override
    protected void getSetData(StringBuilder sb) {

        for (int i = 0; i < repetitionsOrTime.length; i++) {
            sb.append(repetitionsOrTime[i]);
            sb.append(" ");
            sb.append(REPETITIONS);
            sb.append(" @ ");
            sb.append(weight[i]);
            sb.append(POUNDS);
            sb.append(TIMES_TWO);
            sb.append("\n");
        }
    }
}
