public class Driver{
  public static void main(String[] args){

    BST test = new BST();
    test.add(50);
    test.add(25);
    test.add(100);
    System.out.println(test.preorder());
    System.out.println(test.size());
    System.out.println(test.mini());
  }
}
