package L29_LambdaExpressions;

public class c4l4_ShortLambdaExpression {
    static void def(Test5 t) {
        System.out.println(t.abc("Hello!"));
    }

    public static void main(String[] args) {
        def(s -> s.length());
        // def( () -> 5); if abc() 0 parameters
        // def( (x) -> x.length() );
        // def( (String x) -> x.length() );
        // def( (x,y) -> x.length() );
        // def( (String x, String y) -> x.length() );
        // def( (int x, int y) -> { x =5; return 10;} );
        // def( (int x, int y) -> { int x2=5; return 10;} );
    }
}

interface Test5 {
    int abc(String s);
}
