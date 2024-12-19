//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rectangle {
    double width;
    double height;

    // Конструктор по умолчанию
    public Rectangle() {
        this.width = -1;
        this.height = -1;
    }

    // Конструктор с параметрами
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Метод для вычисления площади
    public double getArea() {
        return width * height;
    }

    // Метод для вычисления периметра
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        // Создание двух объектов Rectangle
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        // Отображение характеристик первого прямоугольника
        System.out.println("Прямоугольник 1:");
        System.out.println("Ширина: " + rect1.width);
        System.out.println("Высота: " + rect1.height);
        System.out.println("Площадь: " + rect1.getArea());
        System.out.println("Периметр: " + rect1.getPerimeter());

        // Отображение характеристик второго прямоугольника
        System.out.println("Прямоугольник 2:");
        System.out.println("Ширина: " + rect2.width);
        System.out.println("Высота: " + rect2.height);
        System.out.println("Площадь: " + rect2.getArea());
        System.out.println("Периметр: " + rect2.getPerimeter());
    }
}
