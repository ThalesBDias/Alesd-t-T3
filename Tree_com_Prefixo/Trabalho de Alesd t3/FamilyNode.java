import java.util.LinkedList;

public class FamilyNode {
  LinkedList<FamilyNode> next;
  String Name;
  Integer Land;

  public FamilyNode(String Name, Integer Land ) {
    this.Land = Land;
    this.Name = Name;
    next = new LinkedList<FamilyNode>();
    
  }

  
  
}