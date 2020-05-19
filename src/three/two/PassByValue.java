package three.two;

public class PassByValue {

    public static void main(String[] args){
        PassByValue pbv = new PassByValue();
    }

    /*
    These variables will be initialized before the constructor
    is called.
     */
    private int primitiveVar = 1;
    private String referenceVar = "Oy, blin!";


    public PassByValue() {
        printInt(primitiveVar);
        printString(referenceVar);
    }

    private void printInt(int prim){
        System.out.println(prim);
    }

    private void printString(String ref){
        System.out.println(ref);
    }
}
