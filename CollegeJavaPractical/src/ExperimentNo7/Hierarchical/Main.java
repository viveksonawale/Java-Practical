package ExperimentNo7.Hierarchical;

class Engineering {
    String classEngineering = "Hello this is Engineer Class!";
}

class Computer extends Engineering {
    String classComputer = "Hello this is Computer Class!";

}

class IT extends Engineering{
    String classIT = "Hello this is IT Class!";

}

class AIML extends Engineering{
    String classAIML = "Hello this is AI/ML Class!";

}

public class Main {
    public static void main(String[] args) {
    Computer computer = new Computer();
    IT it = new IT();
    AIML aiml = new AIML();

        System.out.println(computer.classEngineering);
        System.out.println(it.classEngineering);
        System.out.println(aiml.classEngineering);

    }

}
