package pe.prob;

public class P004 {
    private int p;

    public P004() {
        this.p = 0;
    }

    private boolean isp(int n) {
        String s = String.valueOf(n);
        String r = new StringBuffer(s).reverse().toString();
        return s.equals(r);
    }

    public int aop() {
        for (int i = 999; i >= 100; --i) {
            for (int j = 90; j >= 10; --j) {
                int n = 11 * j * i;
                if (n > this.p && this.isp(n)) {
                    this.p = n;
                }
            }
        }

        return this.p;
    }

}
