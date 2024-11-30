package nestedClass;

class Outer2 {
    void show() {
        System.out.println("1");
        class Inner2 {
            void show2() {
                System.out.println("2");
            }
        }
        Inner2 i = new Inner2();
        i.show2();

    }
}

public class MethodLocalInnerClass1 {
    public static void main(String[] args) {
        Outer2 ob = new Outer2();
        ob.show();
    }
}
