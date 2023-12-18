
public class MainClass {
    public static void main(String[] args){
        Fraction test = new Fraction(2, 15);
        Fraction test2 = new Fraction(14, 27);
        Fraction test3 = test.divide(test2);

        test3.print();
    }
}