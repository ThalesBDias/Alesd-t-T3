public class Node {
  int value;

  Node left;
  Node right;
  //Node father;

  public Node(int value) {
    this.value = value;
  }

  public String toString() {
    return String.format("(%d)", value);
  }
}