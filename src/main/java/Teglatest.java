public class Teglatest {
    // "Az adattagok hozzáférése legyen privát"
    private int a;
    private int b;
    private int c;

    // "Az osztálynak legyen egy alapértelmezett konstruktora, amely minden élhez 1-et állít be"
    public Teglatest() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    // "Legyen ezen felül egy olyan konstruktora is az osztálynak ahol be lehet állítani az élek hosszúságát."
    public Teglatest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // "Minden adattaghoz készíts GET és SET publikus függvényt"
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    // flszín számítása: 2*(ab + ac + bc)
    public int getFelszin() {
        return 2 * (a * b + a * c + b * c);
    }

    // téérfogat számítása: a * b * c
    public int getTerfogat() {
        return a * b * c;
    }
}
