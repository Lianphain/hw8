public class Driver{
  public static void main(String[] args){

    BST test = new BST();
    test.add(50);
    test.add(25);
    test.add(100);
    test.add(15);
    test.add(55);
    test.add(98);
    test.add(33);
    System.out.println(test.preorder());
    System.out.println(test.inorder());
    System.out.println(test.postorder());
    System.out.println(test.size());
    System.out.println(test.mini());
    System.out.println(test.max());
    System.out.println(test.search(33));
  }
}
