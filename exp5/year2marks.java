package year2;
public class year2marks {
    public double sub3mark, sub4mark;

    public year2marks(double a, double b) {
        sub3mark = a;
        sub4mark = b;
    }

    public String Sub2(double m1) {
        if (m1 >= 50)
            return "PASS";
        else
            return "FAIL";
    }
}