package four.two;

import java.util.ArrayList;
import java.util.List;

public class InheritanceAsAbstraction {
    public static void main(String[] args) {
        final Squats squats = new Squats("Skwaats", "20", 185);

        //getExerciseName is defined outside of the Squats class, but we can still use it!
        System.out.println(squats.getExerciseName());

        final Exercise catStretch = new CatStretch("CatStretch", "120", 225);
        final Exercise walking = new Walking("Walking", "10", 2.5f);
        final Exercise running = new Running("Running", "20", 330);

        List<Exercise> exerciseList = new ArrayList<>();

        exerciseList.add(squats);
        exerciseList.add(catStretch);
        exerciseList.add(walking);
        exerciseList.add(running);

        exerciseList.forEach(
                exercise -> System.out.println(exercise.exerciseName)
        );

    }
}
