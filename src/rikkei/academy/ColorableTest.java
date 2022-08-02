package rikkei.academy;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[2] = new Rectangle();
        shapes[1] = new Square();
        for (int i =0;i< shapes.length;i++){
            System.out.println("Area of "+shapes[i]+ " is " +shapes[i].getArea());
            if (shapes[i] instanceof Square){
                System.out.println(((Square) shapes[i]).howToColor());
            }
        }
    }
}
