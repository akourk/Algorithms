public class WeightedQuickUnionWithPathCompression extends WeightedQuickUnion{

    private int[] parent;

    public WeightedQuickUnionWithPathCompression(int n) {
        super(n);
    }

    @Override
    public int root(int i) {
        while (id[i] != i) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}
