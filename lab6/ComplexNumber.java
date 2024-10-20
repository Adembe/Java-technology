package lab6;

public class ComplexNumber<T> {
    private T re;
    private T im;

    public T getRe() {
        return re;
    }

    public void setRe(T re) {
        this.re = re;
    }

    public T getIm() {
        return im;
    }

    public void setIm(T im) {
        this.im = im;
    }

    public ComplexNumber(T re, T im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber<T> add(ComplexNumber<T> other) {
        T newReal = addNumber(this.re, other.re);
        T newImaginary = addNumber(this.im, other.im);
        return new ComplexNumber<>(newReal, newImaginary);
    }

    public ComplexNumber<T> subtract(ComplexNumber<T> other) {
        T newRe = subNumber(this.re, other.re);
        T newIm = subNumber(this.im, other.im);
        return new ComplexNumber<>(newRe, newIm);
    }

    public void printValues() {
        System.out.println(re + " + " + im + "i");
    }

    private T addNumber(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf((Integer) a + (Integer) b);
        } else if (a instanceof Double) {
            return (T) Double.valueOf((Double) a + (Double) b);
        } else {
            return null;
        }
    }

    private T subNumber(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf((Integer) a - (Integer) b);
        } else if (a instanceof Double) {
            return (T) Double.valueOf((Double) a - (Double) b);
        } else {
            return null;
        }
    }
}
