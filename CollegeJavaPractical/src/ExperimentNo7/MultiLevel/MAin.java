package ExperimentNo7.MultiLevel;

    class A {
        String superClassA = "This is a Super Class";
    }

    class B extends A {
        String superClassB = "This is a subClass Class B";
    }

    class C extends B{
        String superClassC = "This is a subclass Class C";
    }

    public class MAin {
        public static void main(String[] args) {
            C c = new C();
            System.out.println(c.superClassA);
            System.out.println(c.superClassB);
            System.out.println(c.superClassC);
        }
    }
