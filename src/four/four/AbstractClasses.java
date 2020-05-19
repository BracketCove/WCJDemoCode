package four.four;

public class AbstractClasses {

    public static void main(String[] args) {
        int[] reps = {10, 10, 8};
        double[] weight = {70.0, 70.0, 70.0};

//        AbstractExerciseStarter e1 = new BarbellExercise(
//                "Barbell",
//                "Barbell Bench Press",
//                reps,
//                weight
//        );

        AbstractExercise e2 = new DumbbellExercise(
                "Dumbbell",
                "Dumbbell Bench Press",
                reps,
                weight
        );

        AbstractExercise e3 = new BodyweightExercise(
                "Bodyweight",
                "Push Up",
                reps,
                weight
        );

        System.out.println(
          //      e1.getFormattedOutput() +
                         e2.getFormattedOutput()
                        + e3.getFormattedOutput()
        );
    }
}
