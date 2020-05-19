package four.two;

import java.util.ArrayList;
import java.util.List;

public class InheritanceStarter {
    public static void main(String[] args) {
        final Squats squats = new Squats("Skwaats", "20", 185);

        //Even though getExerciseName() is defined within Exercise.java,
        //our Squats class can use it due to inheritance!
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
                //This is a lambda expression. The Type of this variable "exercise"
                //comes from "Exercise" in List<Exercise> defined above
                exercise -> System.out.println(exercise.getExerciseName())
        );




    }
}
