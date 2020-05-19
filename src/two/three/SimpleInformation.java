package two.three;

public class SimpleInformation {
    public static void main(String[] args){
        int[] integerArray = new int[4];
        integerArray[1] = 2;

        for (   //create a new int variable and initialize it to 0
                int index = 0;
                //Predicate: loop until this condition is false
                index < integerArray.length;
                //Every time we loop, index = index + 1
                index++
        ) {
            //Whatever is within these curly brackets will be repeated!
            System.out.println(integerArray[index]);
        }

        int[][] twoDim = new int[3][3];
        //code challenge: Make the cell in the 3rd row, 3rd column of this array, equal to 5

        //correct answer:
        twoDim[2][2] = 5;
    }
}
