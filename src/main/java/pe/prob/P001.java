package pe.prob;

public class P001 {
    private final int x;
    private final int y;
    private final int u;

    public P001(int num1, int num2, int upto) {
        this.x = num1;
        this.y = num2;
        this.u = upto;
    }

    public P001() {
        this(3, 5, 999);
    }

    private int son(int n) {
        return n * (n + 1) / 2;
    }

    private int nom(int n) {
        return this.u / n;
    }

    private int som(int n) {
        return n * this.son(this.nom(n));
    }

    public int aop() {
        return som(this.x) + som(this.y) - som(this.x * this.y);
    }
}
