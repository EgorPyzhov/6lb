class Figure {
    protected String name;

    public Figure() {
        this.name = "Геометрична фігура";
    }

    public Figure(String name) {
        this.name = name;
    }

    public double area() {
        return 0;
    }

    public void showInfo() {
        System.out.println("Фігура: " + name);
    }

    public void showInfo(String message) {
        System.out.println(message + ": " + name);
    }
}

class Circle extends Figure {
    private double radius;

    public Circle() {
        super("Коло");
        this.radius = 1;
    }

    public Circle(double radius) {
        super("Коло");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void showInfo() {
        System.out.println("Коло, радіус: " + radius
                + ", площа: " + area());
    }
}

class Drawing {
    private Figure figure;

    public Drawing() {
        this.figure = new Figure();
    }

    public Drawing(Figure figure) {
        this.figure = figure;
    }

    public void showInfo() {
        System.out.println("Малюнок містить фігуру:");
        figure.showInfo();
    }

    public void showInfo(String title) {
        System.out.println(title);
        figure.showInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure();
        Circle circle = new Circle(5);

        figure.showInfo();
        figure.showInfo("Назва");
        System.out.println("Площа фігури: " + figure.area());

        circle.showInfo();
        System.out.println("Площа кола: " + circle.area());

        Figure anotherCircle = new Circle(3);
        anotherCircle.showInfo();

        Drawing drawing = new Drawing(circle);
        drawing.showInfo();
        drawing.showInfo("Інформація про малюнок");
    }
}