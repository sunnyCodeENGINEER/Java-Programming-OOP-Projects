abstract class AbstractClass {
    protected int i = 25; // can be modified
    static final int f = 100; // can not be modified

    abstract void show();
    void display() {
        System.out.println("Non-abstract method");
    }
}

public class AbstractClassExample extends AbstractClass {
    public static void main(String[] args) {
        AbstractClass A = new AbstractClassExample();

        A.display();
        A.show();

        System.out.println(A.i);
        System.out.println(AbstractClass.f);

    }

    @Override
    void show() {
        // TODO Auto-generated method stub
        System.out.println("This is show() method of abstract class");
        
    }
}


