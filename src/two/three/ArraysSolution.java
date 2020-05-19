package two.three;

public class ArraysSolution {
    public static void main(String[] args){
        int[] integerArray = new int[4];
        integerArray[1] = 2;


        for (   //create a new int variable and initialize it to 0
                int index = 0;
                //Predicate: loop until this condition is false (i.e. index > integerArray.length)
                index < integerArray.length;
                //Every time we loop, index = index + 1
                index++)
        //repeat whatever is in these curly braces until the Predicate fails
        {

            System.out.println(integerArray[index]);
        }

        int[][] twoDim = new int[3][3];

        twoDim[2][2] = 5;
    }
}
