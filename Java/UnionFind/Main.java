import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        In in = new In("data.txt");

        int n = in.readInt();

        UnionFind uf = new WeightedQuickUnion(n);
        while(!in.isEmpty()) {
            int p = in.readInt();
            int q = in.readInt();
            uf.union(p, q);
        }

        StdOut.print(uf.getCount());
    }
}
