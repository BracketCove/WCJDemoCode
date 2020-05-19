package four.two;

public class Squats extends AnaerobicExercise {
    private final int weight;

    public Squats(String exerciseName,
                  String repetitions,
                  int weight) {
        super(exerciseName, repetitions);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
