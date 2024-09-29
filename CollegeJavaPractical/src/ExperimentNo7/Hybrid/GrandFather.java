package ExperimentNo7.Hybrid;

public class GrandFather {
    public void show(){
        System.out.println("This is GrandFAther class");
    }
}

class Father extends GrandFather {
    public void show(){
        System.out.println("This is Father class");
    }
}

class Child1 extends Father {
    public void show(){
        System.out.println("This is Child1 class");
    }
}
class Child2 extends Father{
    public void show(){
        System.out.println("This is Child2 class");
    }
}

class Main {
    public static void main(String[] args) {
       Child2 child2 = new Child2();
       child2.show();
    }
}

