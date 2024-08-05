package pe.prob;

public class P003 {
    private long n;
    private long f;

    public P003(long num) {
        this.n = num;
        this.f = this.n;
    }

    public P003() {
        this(600_851_475_143L);
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

    public long aop() {
        while (this.n != 1) {
            this.f = this.sf(this.n);
            this.n /= this.f;
        }

        return this.f;
    }
}
