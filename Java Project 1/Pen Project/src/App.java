public class App {
    public static void main(String[] args) throws Exception {
        Pen myPen = new Pen("Gel", "Red", 15);

        System.out.println(String.format("You have a %s %s pen with a pen-point of %d.", myPen.color, myPen.type, myPen.point));

        System.out.println("Hello, World!");
    }
}
