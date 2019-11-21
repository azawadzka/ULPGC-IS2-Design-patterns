interface Iterator {

    boolean hasNext();
    int next();
}

public class FibonacciGenerator implements Iterator {

    private int a = 0;
    private int b = 1;

    @Override
    public int next() {
        if (this.hasNext()) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    @Override
    public boolean hasNext() {
        return b < 1000000;
    }


    public static void main(String[] args) {
        FibonacciGenerator g = new FibonacciGenerator();
        while (g.hasNext()) {
            System.out.println(g.next());
        }
    }
}

