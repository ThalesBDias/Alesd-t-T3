// https://en.wikipedia.org/wiki/Trie

public class PrefixTree {

  private final TreeNode root = new TreeNode(' ');

  /**
   *
   */
  public boolean get(String s) {
    if (s == null)
      throw new IllegalArgumentException();
    if (s.isBlank())
      throw new IllegalArgumentException();

      return get(root, s);  
  }

  private boolean get(TreeNode n, String s) {
    char firstChar = s.charAt(0);
    String remainder = s.substring(1);
    TreeNode p = n.next[firstChar];

    if (p == null) 
      return false;
    
    if (remainder.isBlank())
      return p.isWord;

    return get(p, remainder);
  }
  

  
  /**
   * @param s
   */
  public void put(String s) {
    if (s == null)
      throw new IllegalArgumentException();
    if (s.isBlank())
      throw new IllegalArgumentException();
    put(root, s);
  }

  private void put(TreeNode n, String s) {

    char firstChar = s.charAt(0);
    String remainder = s.substring(1);

    if (n.next[firstChar] == null) 
      n.next[firstChar] = new TreeNode(firstChar);
    
    if (remainder.isBlank())
      n.next[firstChar].isWord = true;
    else
      put(n.next[firstChar], remainder);

  }

  public String complete(String p)   {
    return complete(root, p, p);
  }

  private String complete(TreeNode n, String p, String fix) {
    char firstChar = p.charAt(0);
    String remainder = p.substring(1);
    TreeNode tn = n.next[firstChar];

    if (tn == null) 
      return "";
    
    if (remainder.isBlank())
      return toString(tn, fix);

    return complete(tn, remainder, fix);
  }
  
  /**
   *
   */
  public String toString() {
    return toString(root, "");
  }

  public String toString(TreeNode n, String s) {
    String r = "";
    for (int i = 0; i < n.next.length; i++) {
      if (n.next[i] != null) {
        String prefix = s + n.next[i].c;
        if (n.next[i].isWord) {
          //System.out.printf( "%s\n", prefix);
          r = r + prefix + "\n";
        }
        r = r + toString(n.next[i], prefix);
      }
    }
    return r;  
  }

}







