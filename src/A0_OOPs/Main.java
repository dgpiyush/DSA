package A0_OOPs;

class Pen {
    private String color;
    private String type;

    void setColor(String color) {
        this.color = color;
    }

    void settype(String type) {
        this.type = type;
    }

    String getColor() {
        return this.color;
    }

    String getType() {
        return this.type;
    }

}

public class Main {
    public static void main(String[] args) {
        Pen p = new Pen();
        Pen q = new Pen();
        p.setColor("piyush");
        q.setColor("Q-piyush");
        System.out.println(p.getColor());
        System.out.println(q.getColor());

        System.out.println("Main.main()");
        

    }
}
