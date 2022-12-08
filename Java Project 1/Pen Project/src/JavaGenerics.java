public class JavaGenerics<T> {
    private T toPrint;

    public JavaGenerics(T toPrint) {
        this.toPrint = toPrint;
    }

    public void printOut() {
        System.out.println(toPrint);
    }

}
