package polymorphism.MethodOverloading;

class Test4 {
    void display(int a) {
        System.out.println(a);
    }
}

public class MethodOverloading5 {
    public static void main(String[] args) {
        Test4 t = new Test4();
        t.display('d');
    }
}
