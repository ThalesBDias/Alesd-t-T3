class Main {
  //Autor Thales Bossle Dias
  public static void main(String[] args) {
    

    FamilyTree t = new FamilyTree();

    
    //Teste 1 teste completo "Sunny path"

    /* 
    t.put(t.root,"Deldriralex", 4626 );
    t.put(t.root,"Jocgnibardyx", 3530);
    t.put(t.getter(t.root,1), "Diorflimhikox", 5154);
    t.put(t.getter(t.root,1), "Grutohiaux", 5797);
    t.put(t.getter(t.root,1),"Docmangax", 4471);
    t.put(t.getter(t.root,1), "Delscatorflex", 6180);
    t.put(t.getter(t.root,1), "Cristipix", 5299);
    t.put(t.getter(t.root,1), "Pacmonumicynax", 2056);
    t.put(t.root,"Alteetoflex", 6042 );
    t.put(t.root,"Delrenmax", 6080 );
    t.put(t.getter(t.root,3), "Diormanclox", 4736);
    t.put(t.getter(t.root,3), "Neppanpix", 2249);
    t.put(t.getter(t.root,3), "Klodrimanrix", 5353);
    t.put(t.getter(t.root,3), "Mirtpliblepkox", 3177);
    t.put(t.root,"Frinvinulamax", 3189 );
    System.out.println(t.root.Land);
    System.out.println(t);
    System.out.println(" \n "); 
    */



    
    //Teste 2 de null exception de string
    /*
    t.put(t.root,"Deldriralex", 4626 );
    t.put(t.root,"Jocgnibardyx", 3530);
    t.put(t.getter(t.root,1), "Diorflimhikox", 5154);
    t.put(t.getter(t.root,1), "Grutohiaux", 5797);
    t.put(t.getter(t.root,1),"Docmangax", null);
    t.put(t.getter(t.root,1), "Delscatorflex", 6180);
    t.put(t.getter(t.root,1), "Cristipix", 5299);
    t.put(t.getter(t.root,1), "Pacmonumicynax", 2056);
    t.put(t.root,"Alteetoflex", 6042 );
    t.put(t.root,"Delrenmax", 6080 );
    t.put(t.getter(t.root,3), "Diormanclox", 4736);
    t.put(t.getter(t.root,3), "Neppanpix", 2249);
    t.put(t.getter(t.root,3), "Klodrimanrix", 5353);
    t.put(t.getter(t.root,3), "Mirtpliblepkox", 3177);
    t.put(t.root,"Frinvinulamax", 3189 );
    System.out.println(t.root.Land);
    System.out.println(t);
    System.out.println(" \n "); 
    */

    
    //Teste 3 de null exception de Integer
    
    
    /* 
    t.put(t.root,"Deldriralex", 4626 );
    t.put(t.root,"Jocgnibardyx", 3530);
    t.put(t.getter(t.root,1), "Diorflimhikox", 5154);
    t.put(t.getter(t.root,1), "Grutohiaux", 5797);
    t.put(t.getter(t.root,1),null, 4471);
    t.put(t.getter(t.root,1), "Delscatorflex", 6180);
    t.put(t.getter(t.root,1), "Cristipix", 5299);
    t.put(t.getter(t.root,1), "Pacmonumicynax", 2056);
    t.put(t.root,"Alteetoflex", 6042 );
    t.put(t.root,"Delrenmax", 6080 );
    t.put(t.getter(t.root,3), "Diormanclox", 4736);
    t.put(t.getter(t.root,3), "Neppanpix", 2249);
    t.put(t.getter(t.root,3), "Klodrimanrix", 5353);
    t.put(t.getter(t.root,3), "Mirtpliblepkox", 3177);
    t.put(t.root,"Frinvinulamax", 3189 );
    System.out.println(t.root.Land);
    System.out.println(t);
    System.out.println(" \n ");
    */


    //Teste 4 teste com Menos entradas


    
    t.put(t.root,"Deldriralex", 4626 );
    t.put(t.root,"Jocgnibardyx", 3530);
    t.put(t.getter(t.root,1), "Diorflimhikox", 5154);
    t.put(t.getter(t.root,1), "Grutohiaux", 5797);
    

    t.put(t.root,"Alteetoflex", 6042 );
    t.put(t.root,"Delrenmax", 6080 );
    t.put(t.getter(t.root,3), "Diormanclox", 4736);
    t.put(t.getter(t.root,3), "Neppanpix", 2249);
    
    t.put(t.root,"Frinvinulamax", 3189 );
    System.out.println(t.root.Land);
    System.out.println(t);
    
  }
}