public class CounterDemo {
    public static void main(String[] args) {
        Counter c;
        System.out.println(c.getCount());
        c = new Counter();
        c.increment();
        c.increment(3);
        int temp = c.getCount();
        c.reset();
        Counter d = new Counter(5);
        d.increment();
        Counter e = d;
        temp = e.getCount();
        e.increment(2);
        System.out.println(d.getCount());
        System.out.println(e.getCount());
    }
}
