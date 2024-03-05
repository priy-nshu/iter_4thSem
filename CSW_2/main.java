package CSW_2;

class complex {
    private double re, im;

    complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getReal() {
        return this.re;
    }

    public double getImaginary() {
        return this.im;
    }

    public void setReal(double re) {
        this.re = re;
    }

    public void setImaginary(double im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return "Real: " + re + ", Imaginary: " + im;
    }
}

public class main {
    public static void main(String[] args) {
        complex c1 = new complex(10, 15);
        complex c2 = new complex(10, 15);
        if (c1 == c2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}