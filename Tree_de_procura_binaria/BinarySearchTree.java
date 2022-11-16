 public class BinarySearchTree {

  private Node root;

  public boolean contains(int value) {
    return contains(root, value);
  }

  private boolean contains(Node n, int value) {
    System.out.println(n);
    if (n == null)
      return false;

    if (value < n.value)
      return contains(n.left, value);
    else if (value > n.value)
      return contains(n.right, value);
    else 
      return true;    
  }

   
  public void put(int value) {
    root = put(root, value);
  }

  public Node put(Node n, int value) {
    if (n == null)
      return new Node(value);
    
    if (value < n.value)
      n.left = put(n.left, value);
    else
      n.right = put(n.right, value);
    
    return n;
  }

  public String toString() {
    return toString(root);
  }

  public String toString(Node n) {
    if (n == null)
      return "#";
    return String.format("{%s %d %s}",  toString(n.left), n.value, toString(n.right));
  }  
}