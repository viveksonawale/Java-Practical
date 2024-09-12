package ExperimentNo7.Hybrid;

public class GrandFather {
    String variableGrandFather = "this is the grandfather class";
}

class Father extends GrandFather {
    String variableFather = "this is the Father class";
}

class Child1 extends Father {
    String vairbleChild1 = "this is first child class";
}
class Child2 extends Father{
    String variableChild2 = "this is second child class";
}

class Main {
    public static void main(String[] args) {
        Father father = new Father();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        System.out.println(father.variableGrandFather);

        System.out.println(child1.variableFather);

//        printing the variable from the father class
        System.out.println(child1.variableFather);
        System.out.println(child1.vairbleChild1);
        System.out.println(child2.variableFather);
        System.out.println(child2.variableChild2);
    }
}

