package pe.prob;

public class P005 {
    private int l;
    private int f;
    private final int u;

    public P005(int from, int upto) {
        this.l = 1;
        this.f = from;
        this.u = upto;
    }

    public P005() {
        this(1, 20);
    }

    private int gcd(int x, int y) {
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }

        return x;

    }

    private int lcm(int x, int y) {
        return x * (y / this.gcd(x, y));
    }

    public int aop() {
        while (this.f <= this.u) {
            this.l = this.lcm(this.l, this.f);
            ++this.f;
        }

        return this.l;
    }

}
