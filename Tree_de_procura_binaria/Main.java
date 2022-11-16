
class Main {
  public static void main(String[] args) {
    System.out.println("Árvore Binária de Pesquisa!");

    BinarySearchTree bst = new BinarySearchTree();

    bst.put(45);
    bst.put(42);
    bst.put(60);
    bst.put(49);
    bst.put(70);   
    bst.put(75);   

    System.out.println(bst);

    System.out.println(bst.contains(70));
    System.out.println(bst.contains(75));
    
  }
}