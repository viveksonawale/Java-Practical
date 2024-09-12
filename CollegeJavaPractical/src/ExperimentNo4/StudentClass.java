package ExperimentNo4;

class ConstructorCreator {

    String name;

    public ConstructorCreator() {
        System.out.println("This is Default Constructor!");
    }

    public ConstructorCreator(String nameLocal) {
        System.out.println("This is Parameterized Constructor!!");
        this.name = nameLocal;
    }
}

public class StudentClass {
    public static void main(String[] args) {
        ConstructorCreator constructorCreator = new ConstructorCreator();
        System.out.println("Student Name:"+constructorCreator.name);
        System.out.println("");
        ConstructorCreator constructorCreator1 = new ConstructorCreator("Orewa Vivek Sonawale desu");
        System.out.println("Student Name:" + constructorCreator1.name);
    }
}
