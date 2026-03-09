public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        @Override public String toString() { return color; }
    }
    private boolean capped;
    private Color color;

    public Pen() {
        this.capped = true;
        this.color = Color.RED;
    }

    public Pen(Color color) {
        this.capped = true;
        this.color = color;
    }

    public void capOn() {
        this.capped = true;
    }

    public void capOff() {
        this.capped = false;
    }

    public void changeColor(Color newColor) {
        if (capped) {
            this.color = newColor;
        }
    }

    public String draw() {
        String result = "";
        if (!capped) {
            result = "Drawing " + color.toString();
        }
        return result;
    }
}
