package pe.prob;

public class P006 {
    private final int n;

    public P006(int num) {
        this.n = num;
    }

    public P006() {
        this(100);
    }

    public int aop() {
        return (this.n - 1) * this.n * (this.n + 1) * (3 * this.n + 2) / 12;
    }
}
