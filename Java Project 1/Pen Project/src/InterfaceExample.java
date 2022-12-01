interface I {
    int i = 10; // by default all data in an interface are public-static-final

    void display(); // all methods in an interface are public-abstract(they dont have a code block)
}

public class InterfaceExample implements I{

    @Override
    public void display() {
        // TODO Auto-generated method stub

        System.out.println("Hello there!");
        
    }
    public static void main(String[] args) {
        I iRef = new InterfaceExample();

        iRef.display();
        System.out.println(I.i);
    }

}