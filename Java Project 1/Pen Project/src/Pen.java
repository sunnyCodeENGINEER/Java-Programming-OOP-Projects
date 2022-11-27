public class Pen {
    String type = "Gel";
    String color = "blue";
    int point = 10;
    static boolean clicked = false;

    Pen(String type, String color, int point) {
        this.type = type;
        this.color = color;
        this.point = point;
    }

    public void click() {
        clicked = true;
    }

    public void unclick() {
        clicked = false;
    }
}