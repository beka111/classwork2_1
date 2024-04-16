public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 6);
        Triangle triangle = new Triangle("Треугольник", 3, 4, 5);
        Square square = new Square("Квадрат", 7);
        Rectangle rectangle = new Rectangle("Прямоугольник", 3, 4);

        Dog dog= new Dog("Собака") {



        };
        Cat cat= new Cat("Кошка") {



        };


        Drawable[] drawables = {circle, square, triangle, rectangle, dog, cat};
        for (int i = 0; i < drawables.length; i++) {
            if(drawables[i] instanceof Figure)
                System.out.println(((Figure)drawables[i]).getName()+ "Периметр -> "+ ((Figure)drawables[i]).calculatePerimeter());
            if(drawables[i] instanceof Animal){
                System.out.println(((Animal)drawables[i]).getName());}
            drawables[i].draw();
        }

    }

}