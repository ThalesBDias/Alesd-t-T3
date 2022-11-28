//import java.util.LinkedList;

// https://en.wikipedia.org/wiki/Trie

public class FamilyTree {

  public final FamilyNode root = new FamilyNode("Thorgestax", 103787);

  /**
   *
   */
  

  public FamilyNode getter(FamilyNode n, Integer f) {
    
    if (n.next.isEmpty()) 
      throw new IllegalArgumentException();
    FamilyNode filho = n.next.get(f);
    return filho;
    
  }
  

  
  /**
   * @param s
   */
  /*public void put(String Name, int Land, FamilyNode kin) {
    if (Name == null)
      throw new IllegalArgumentException();
    if (kin == null)
      throw new IllegalArgumentException();
    put(root, Name, Land);
  }*/
  

  public void put(FamilyNode n, String N, Integer L) {
    
    if (n == null)
      throw new IllegalArgumentException();
    if (N == null)
      throw new IllegalArgumentException();
    if (L == null)
      throw new IllegalArgumentException();
    String Name = N;
    Integer Land = L;
    
      n.next.add(n = new FamilyNode(Name, Land));
      
  }

 
  /**
   *
   */
  public String toString() {
    return toString(root, "");
  }

  public String toString(FamilyNode n, String s) {
    String r = " ";
    
    for (int i = 0; i < n.next.size(); i++) {
        String prefix =n.Name+" "+n.next.get(i).Name+" "+ n.next.get(i).Land+"\n";
        if (n.next != null) {
         
          r = r + prefix;
      }

      r = r + toString(n.next.get(i), prefix);
    }
    return r;
      
  }

 /*  public String Count() {
    return Count(root, "");
  }

  public String Count(FamilyNode n, String s) {
    String r = "";
    
    for (int i = 0; i < n.next.size(); i++) {
        String prefix ="";
        //Integer a = n.next.size();
        if (prefix != n.Name) {
          prefix =n.Name;
          
          r = prefix;
        }
        else{
          getter(n.next.get(i),i);
        }
        r = r + Count(n.next.get(i), "prefix" );
      }

      
    

    /*while (n.next !=null) {
      int i = 0;
      getter(getter(n.next.get(i),i),i);
    }*/
}  
      
  











