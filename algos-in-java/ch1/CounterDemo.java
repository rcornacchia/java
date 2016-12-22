public class CounterDemo {
    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.getCount());
        c.increment();
        System.out.println(c.getCount());
    }
}
