package JavaSyntax.l147Inheritance;

public class Rect extends Figure implements To {

    public Rect(double a, double b) {
        super(a, b);
    }

    public Rect(double a) {
        super(a, a);
    }

    @Override
    double getSquare(double a) {
        return super.getSquare(a);
    }

    @Override
    double getSquare(double a, double b) {
        return super.getSquare(a, b);
    }

    @Override
    public void to() {
        System.out.println("Recting");
    }
}
