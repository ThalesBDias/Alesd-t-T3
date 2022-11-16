class Main {
  public static void main(String[] args) {
    System.out.println("Tree!");

    PrefixTree t = new PrefixTree();

    System.out.println(t);
    //System.out.println(t.get("bola"));
    
    //t.put("Bola");
    //t.put("sergipe");
    //t.put("são paulo");
    //t.put("brasil");
    //t.put("bolo");
    //t.put("bolacha");
    //t.put("bola");
    t.put("to");
    t.put("ted");
    t.put("tea");
    t.put("ten");
    t.put("inn");
    
    //System.out.println(t.get("bolacha"));
    //System.out.println(t.get("bola"));
    //System.out.println(t.get("brasil"));
    //System.out.println(t.get("bolo"));

    //System.out.println();

    System.out.println(t.toString());

        
    System.out.println(t.complete("te"));

    
  }
}