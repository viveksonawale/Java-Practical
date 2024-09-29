package ExperimentNo8;

interface A {
    public void thisIsAFunction();
}

interface B {
    public void thisIsBFunction();
}

class C implements A, B {

    @Override
    public void thisIsAFunction() {
        System.out.println("This is the Interface A");
    }

    @Override
    public void thisIsBFunction() {
        System.out.println("This is the Interface B");
    }

    public void thisIsCFunction() {
        System.out.println("This is the Class C");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.thisIsAFunction();
        c.thisIsBFunction();
        c.thisIsCFunction();
    }
}
