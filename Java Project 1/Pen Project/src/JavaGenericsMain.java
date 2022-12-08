public class JavaGenericsMain {
    public static void main(String[] args) {
        JavaGenerics<Integer> thingToPrint = new JavaGenerics<>(24);

        thingToPrint.printOut();
    }
}
