package ExperimentNo7.SingleLevel;

class A {
    String classA = "This is Class A";
}

class B extends A{
    String classB = "This is Class B";
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.classA);
        System.out.println(b.classB);
    }
}

