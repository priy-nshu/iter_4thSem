package CSW_2;

class Overload {
    public void printOutput(int a) {
        System.out.println("the first number is: " + a);
    }

    public void printOutput(int a, int b) {
        System.out.println("The two integers are: " + a + " and " + b);
    }

    public double printOutput(double a) {
        System.out.println("The double number is: " + a);
        return a * a;
    }
}

public class load {
    public static void main(String args[]) {
        double results;
        Overload omObj = new Overload();
        omObj.printOutput(20);
        omObj.printOutput(20, 30);
        results = omObj.printOutput(2.5);
        System.out.println("The multiplication results is: " + results);
    }
}