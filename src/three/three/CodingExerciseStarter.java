package three.three;

public class CodingExerciseStarter {
    public static void main(String[] args) {

        String s = "to!refrain!from!imitation!is!the!best!revenge.     ";
        //Hint: you will need to use s = s.methodName with methods that have a String return type!!

        /* Not allowed
        * s = "..."; You may not directly or partially reassign variable s
        * s = new String("..."); Same as above
        * */

        //Do not change anything below this comment, or you FAIL
        String answer = "To refrain from imitation is the best revenge.";

        if (answer.equals(s)) System.out.println("Well Done! Unless you cheated...");
        else System.out.println("Never give up, never surrender.");
    }
}
