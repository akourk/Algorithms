public class QuickUnion implements UnionFind {

    // an array to hold each element
    protected int[] id;

    // how many groups of elements
    // or, how many unique id's there are
    protected int count;

    // constructor
    public QuickUnion(int n) {

        // initializes our array to the size of our data
        id = new int[n];

        // assigns an id to every location in our array
        for(int i = 0; i < id.length; i++) {
            id[i] = i;
        }

        // initializes all elements as unique, so our total number of
        // unique elements should equal our total number of elements
        count = n;
    }

    // what's unique about QuickUnion is that we connect roots of nodes,
    // not just the nodes themselves. This requires us to create a method
    // to find the root of each node.
    public int root(int i) {

        // while the id of the number doesn't match the number, follow the id back
        while(id[i] != i) {
            i = id[i];
        }
        return i;
    }

    @Override
    public void print() {
        for (int i: id) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    @Override
    public void union(int p, int q) {
        if(find(p, q)) {
            return;
        }

        // same as QuickFind except we want the root, not just the id
        int rp = root(p);
        int rq = root(q);
        id[rp] = id[rq];
        count--;
    }

    // same as QuickFind except we want to see if the elements share the same root
    @Override
    public boolean find(int p, int q) {
        return root(p) == root(q);
    }

    // same as QuickFind
    @Override
    public int getCount() {
        return count;
    }
}
