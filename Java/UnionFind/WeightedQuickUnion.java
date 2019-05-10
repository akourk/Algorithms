public class WeightedQuickUnion extends QuickUnion {

    protected int size[];

    public WeightedQuickUnion(int n) {
        super(n);
        size = new int[n];
        for(int i = 0; i < n; i++) {
            size[i] = 1;
        }
    }


    @Override
    public void union(int p, int q) {

        if(find(p, q)) {
            return;
        }

        int qRoot = root(q);
        int pRoot = root(p);

        if(size[pRoot] <= size[qRoot]) {
            size[qRoot] += size[pRoot];
            id[pRoot] = qRoot;
        } else {
            size[pRoot] += size[qRoot];
            id[qRoot] = pRoot;
        }
        count--;
    }


}
