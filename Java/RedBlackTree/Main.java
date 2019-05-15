package RedBlackTree;

public class Main {

    public static void main(String[] args) {
        RedBlackTree<String, Integer> rbt = new RedBlackTree<String, Integer>();
        rbt.put("S", 1);
        rbt.put("E", 5);
        rbt.put("A", 7);
        rbt.put("R", 10);
        rbt.put("C", 8);
        rbt.put("H", 5);
        for(String key: rbt.keys()) {
            System.out.println(key + ":" + rbt.get(key));
        }
        System.out.println(rbt.is23());
        System.out.println(rbt.isBalanced());


    }
}
