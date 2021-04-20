package MathFunctions;

public class Test {
    public static void main(String[] args) {
        System.out.println(MathFunctionsBase.add(2, 6));
        System.out.println(MathFunctionsBase.add(2, 6, 7));
        System.out.println(MathFunctionsBase.subtract(2, 6));
        System.out.println(MathFunctionsBase.multiply(2, 6));
        System.out.println(MathFunctionsBase.multiply(2, 6, 7));
        System.out.println(MathFunctionsBase.divide(2, 6));
        System.out.println(MyMathFunctions.square(2));
        System.out.println(MyMathFunctions.thirdDegree(2));
        System.out.println(MyMathFunctions.hyperbola(2));
        System.out.println(MyMathFunctions.hyperbola(0));
    }
}

