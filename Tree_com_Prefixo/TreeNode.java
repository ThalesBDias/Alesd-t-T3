public class TreeNode {
  char c;
  TreeNode[] next;
  boolean isWord;

  public TreeNode(char c) {
    this.c = c;
    next = new TreeNode[256];
    isWord = false;
  }
  
}