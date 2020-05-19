package three.one;

public class MethodStructureDemo {

    private void printMessage(String m){
        //Method Body (implementation of the method)
        System.out.println('C');
    }

    private void printMessage(char c){
        //Method Body (implementation of the method)
        System.out.println(c);
    }

    //a & b are Parameter Variables, or just "Parameters"
    private int sum(int a, int b) {
        //result is a local variable
        int result = a + b;
        //all of them last only as long as the execution of
        //this method.
        return result;
    }


    //Camel Case with lower case first letter
    private String toLowerCase(String s){
        return null; // :(
    }

}
