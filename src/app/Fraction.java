package app;

/**
 * Fraction is a class modeling fractions where numerator and denominator are
 * represented as integral number.
 * 
 * @param <Read>
 **/
public class Fraction {
    private int num;
    private int denom;

    /** *Constructs a new Fraction object. 
     * @param init initial value*/ 
    public Fraction(int num, int denom) { 
        int gcf = Math.abs(GCF(num, denom));
        this.num = num/gcf*(denom < 0?-1:1);
        this.denom = Math.abs(denom/gcf);
     } 
    /** *Constructs a new Fraction object. 
     * @param init initial value*/ 
    public Fraction(int num) { 
        this(num, 1);
     } 

    public int getNum() {
        return this.num;
    }

    public int getDenom() {
        return this.denom;
    }

    /** Computes "this+that" and returns the result in a new object. 
        * @param that the left-hand side operand. 
        * @return a new object representing this+that */ 
    public Fraction add(Fraction that) { 
        int newNum = (this.getNum() * that.getDenom()) + 
                     (that.getNum() * this.getDenom());
        int newDenom = this.getDenom() * that.getDenom();
        return new Fraction(newNum, newDenom);
     } 
     
     /** Computes "this+that" and returns the result in a new object. 
      * @param that the left-hand side operand. 
      * @return a new object representing this+that */ 
    public Fraction sub(Fraction that) { 
        return this.add(that.mul(new Fraction(-1,1)));
     } 
    
    /** Computes "this_that" and returns the result in a new object. 
     * @param that the left-hand side operand. * @return a new object representing this+that */ 
    public Fraction mul(Fraction that) { 
        return new Fraction(this.getNum()*that.getNum(), this.getDenom()*that.getDenom());
     } 
    /** Computes "this*that" and returns the result in a new object. 
     * @param that the left-hand side operand. 
     * @return a new object representing this*that */ 
    public Fraction mul(int that) { 
        return new Fraction(this.getNum()*that, this.getDenom());
     } 
    
    /** Computes "this/that" and returns the result in a new object. 
     * param that the left-hand side operand. * @return a new object representing this/that */ 
    public Fraction div(Fraction that) { 
        return this.mul(that.inv());
     } 

    /** Computes "this%that" and returns the result in a new object. 
     * param that the left-hand side operand. 
     * @return a new object representing this%that */ 
    public Fraction mod(Fraction that) { 
        return this.div(that).getQuotient();
     } 

    /** Inverses the fraction.
        * @return a new fraction object that is denom/num. */ 
    public Fraction inv() { 
        return new Fraction(this.denom, this.num);
     } 
    
    /** Computes the quotient of the fraction. NOTE: returns the fractional
     * part of the quotient, not the quotient itself (as this is what I
     * assume is wanted due to the seperate functions). 
     * @return a new object representing the quotient of this/that */ 
    public Fraction getQuotient() { 
        return new Fraction(this.getNum()%this.getDenom(),this.getDenom());
     } 
    
    /** Computes the remainder of the fraction. 
     * @return a new object representing the remainder of this/that */ 
    public Fraction getRemainder() { 
        return new Fraction(this.getNum()/this.getDenom(),1);
    } 

    //INTEGER STYLE
    /** Computes the remainder of the fraction. 
     * @exception DivisionByZeroException
     * @return a new object representing the remainder of this/that */ 
    public int getRemainderInt() { 
        return this.getNum()/this.getDenom();
     } 
    
    /** Computes the floating point value of the fraction. 
     * @exception DivisionByZeroException
     * @result a floating point number that approximates this fraction */ 
    public double doubleValue() { 
        return (double)this.getNum()/(double)this.getDenom(); 
    } 
    
    /** Returns the textual representation of the fraction in the form 
     * of "num / denom". If denom equals 1, only num will be 
     * returned. If denom equals 0, the string "in_nity" should be returned. 
     * @result a string representing this fraction */ 
    public String toString() {
        String result = "";
        if (denom==1) {
            result = Integer.toString(num);
        } else if (denom==0) {
            result = "infnity"; //?? Infinity? Typo or expecting in_nity?
        } else {
            result = Integer.toString(num) + "/" + Integer.toString(denom);
        }
        return result;
    }

    private static int GCF(int a, int b) { 
        if (b == 0) { 
            return a;
        } else { 
            return (GCF(b, a % b)); 
        } 
    }

    // Credit for GCF: 
    // https://javarevisited.blogspot.com/2016/07/how-to-calculate-gcf-and-lcm-of-two-numbers-in-java-example.html#ixzz5zqk5iFUA
} 