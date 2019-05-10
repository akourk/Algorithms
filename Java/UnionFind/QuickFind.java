public class QuickFind implements UnionFind {

    // an array to hold each element
    private int[] id;

    // how many groups of elements
    // or, how many unique id's there are
    private int count;

    // constructor
    public QuickFind(int n) {

        // initializes our array to the size of our data
        id = new int[n];

        // assigns an id to every location in our array
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }

        // initializes all elements as unique, so our total number of
        // unique elements should equal our total number of elements
        count = n;
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

        // if the elements are already connected, then return
        if (find(p, q)) {
            return;
        }

        // set the elements to primitives so we don't have to access the array multiple times
        int pID = id[p];
        int qID = id[q];

        // now, iterate through the entire array. If any of the id's match p,
        // change them to q.
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pID) {
                id[i] = qID;
            }
        }

        // now we decrement the number of groups of elements
        count--;


        // compares to array value, so more array accesses
        // less efficient, should store values as primitives like above
//        if (find(p, q)) {
//            return;
//        }
//        for(int i = 0; i < id.length; i++) {
//            if(id[i] == id[p]) {
//                id[i] = id[q];
//            }
//        }
//        count--;
    }

    @Override
    public boolean find(int p, int q) {

        // are p and q connected? if yes, return true, if no, return false
        return id[p] == id[q];
    }

    @Override
    public int getCount() {

        // how many groups of elements are there?
        return count;
    }
}
