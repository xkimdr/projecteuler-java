package pe.prob;

public class P002 {
    private final int u;
    private int x;
    private int y;
    private int z;

    public P002(int upto) {
        this.x = 2;
        this.y = 8;
        this.z = this.z();
        this.u = upto;
    }

    public P002() {
        this(4_000_000);
    }

    private int z() {
        return this.x + 4 * this.y;
    }

    public int aop() {
        int sum = this.x + this.y;

        while (this.z <= this.u) {
            sum += this.z;
            this.x = this.y;
            this.y = this.z;
            this.z = this.z();
        }

        return sum;
    }
}
