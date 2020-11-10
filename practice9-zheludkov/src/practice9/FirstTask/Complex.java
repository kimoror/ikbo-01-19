package practice10.task1;

public class Complex {

    private int real;
    private int image;

    public Complex(){};

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImagin() {
        return image;
    }

    public void setImagin(int imagin) {
        this.image = imagin;
    }

    @Override
    public String toString() {
        return "Real: " + real+
                "\n" + "Imaginary: " + image;
    }
}
