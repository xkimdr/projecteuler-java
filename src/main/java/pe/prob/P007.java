package pe.prob;

public class P007 {
    private final long n;
    private long p;
    private long c;

    public P007(long num) {
        this.p = 2;
        this.c = 1;
        this.n = num;
    }

    public P007() {
        this(10_001);
    }

    private long sf(long n) {
        long sq = (long) Math.sqrt(n);

        for (long i = 2; i <= sq; ++i) {
            if (n % i == 0) {
                return i;
            }
        }

        return n;
    }

    private boolean isp(long n) {
        return n == this.sf(n);
    }

    public long aop() {
        while (this.c <= this.n) {
            if (this.isp(this.p)) {
                ++this.c;
            }
            ++this.p;
        }

        return --this.p;
    }

}
