package ExperimentNo3;

class classExample2 {
    int rollNo;
    String name;

    void insert(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo);
        System.out.println(name);
    }
}

public class ClassFour {
    public static void main(String[] args) {
        classExample2 classExample2 = new classExample2();
        classExample2 classExample21 = new classExample2();
        classExample2.insert(69696, "Vivek Sonawale");
        classExample21.insert(99999999, "SaitamaTheOnePuchMan");
        classExample2.display();
        classExample21.display();
    }
}
