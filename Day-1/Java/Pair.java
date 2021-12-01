public class Pair {
    
    private final int first;
    private final int second;

    private Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static Pair of(int first, int second) {
        return new Pair(first, second);
    }

    public int getFirst() {
        return this.first;
    }

    public boolean increased() {
        return this.first > this.second;
    }

    public int getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return "Pair(" + first + ", " + second + ")";
    }
}
