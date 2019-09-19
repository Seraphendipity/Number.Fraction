package app;

//import org.graalvm.compiler.hotspot.stubs.DivisionByZeroExceptionStub;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println( "===============" );
        System.out.println( "FractionDemo");
        System.out.println( "BY: elirose");
        System.out.println( "_______________" );

        Fraction F1 = new Fraction(16,12);
        System.out.print("Fraction F1(16,12): ");
        System.out.println(F1.toString());

        Fraction F2 = new Fraction(15,25);
        System.out.print("Fraction F2(15,25): ");
        System.out.println(F2.toString());

        Fraction F3 = new Fraction(8,16);
        System.out.print("Fraction F3(8,16): ");
        System.out.println(F3.toString());

        Fraction F4 = F1.inv();
        System.out.print("Fraction F4(F1.inv()): ");
        System.out.println(F4.toString());

        Fraction F5 = new Fraction(7,0);
        System.out.print("Fraction F5(7,0): ");
        System.out.println(F5.toString());

        Fraction F6 = new Fraction(0,9);
        System.out.print("Fraction F6(0,9): ");
        System.out.println(F6.toString());

        System.out.println();
        Fraction val;
        val = F2.add(F3);
        System.out.println("F2 + F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F2.sub(F3);
        System.out.println("F2 - F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F2.mul(F3);
        System.out.println("F2 * F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F2.div(F3);
        System.out.println("F2 / F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F2.mod(F3);
        System.out.println("F2 % F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        
        System.out.println();
        try {
        val = F5.add(F3);
        System.out.println("F5 + F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F5.sub(F3);
        System.out.println("F5 - F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F5.mul(F3);
        System.out.println("F5 * F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F5.div(F3);
        System.out.println("F5 / F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F5.mod(F3);
        System.out.println("F5 % F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
    } catch (Exception e) {
        System.out.println("Divide by zero exception ocurred; this is expected, as the programmer here is trying to call an integer X divided by 0 operation.");
    }
        
        System.out.println();
        
        val = F6.add(F3);
        System.out.println("F6 + F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F6.sub(F3);
        System.out.println("F6 - F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F6.mul(F3);
        System.out.println("F6 * F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F6.div(F3);
        System.out.println("F6 / F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());
        val = F6.mod(F3);
        System.out.println("F6 % F3 = " + val + " = " + val.getRemainder() + " " + val.getQuotient() + " = " + val.doubleValue());

        System.out.println( "===============" );
    }
}