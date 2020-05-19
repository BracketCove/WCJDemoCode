package three.three;

public class CodingExerciseSolution {
    public static void main(String[] args) {
        String s = "to!refrain!from!imitation!is!the!best!revenge.     ";
        s = s.replace('!', ' ');
        s = s.replaceFirst("t", "T");
        s = s.trim();


        String answer = "To refrain from imitation is the best revenge.";

        if (answer.equals(s)) System.out.println("Well Done! Unless you cheated...");
        else System.out.println("Never give up, never surrender.");
    }
}
