package ExperimentNo3;

class Constt {
    int id;
    String name;

    public Constt(int i, String n) {
        this.id = i;
        this.name = n;
        System.out.println(this.id);
        System.out.println(this.name);
    }
}

public class ClassFive {
    public static void main(String[] args) {
        Constt constt = new Constt(1234, "Vivek Sonawale");
    }
}
