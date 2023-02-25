test;
[src2.pack2] {
[UsagesFromBoth2]
    package pack2;
  
  import pack1.*;
  import target.pack1.S1;
  
  public class UsagesFromBoth2 {
    S1 s1;
    S2 s2;
  }
  
}
[src2.pack1] {
[S2]
    package pack1;
  
  public class S2{}
  
}
[src1.pack2] {
[UsagesFromBoth]
    package pack2;
  
  import pack1.*;
  import target.pack1.S1;
  
  public class UsagesFromBoth {
    S1 s1;
    S2 s2;
  }
  
}
[src1.target.pack1] {
[US]
    package target.pack1;
  
  class US {
    S11 myS11WithoutImport;
  }
[S1]
    package target.pack1;
  
  public class S1{
    S11 s11;
  }
  
  class S11{}
  
  class S12{}
  
  class S13{}
  
}
