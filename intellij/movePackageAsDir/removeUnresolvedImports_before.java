test;
[src2.pack2] {
[UsagesFromBoth2]
    package pack2;
  
  import pack1.*;
  
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
  import pack1.subpack.*;
  
  public class UsagesFromBoth {
    S1 s1;
    S2 s2;
    SS ss;
  }
  
}
[src1.pack1.subpack] {
[SS]
    package pack1.subpack;
  
  public class SS {}
  
}
[src1.pack1] {
[S1]
    package pack1;
  
  public class S1{}
  
}
