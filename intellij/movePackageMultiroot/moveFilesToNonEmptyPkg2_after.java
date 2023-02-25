test;
[src1] {
[module-info]
    module M {
      exports pack1 to java.compiler;
      opens pack1.pack2 to java.base, java.xml;
      exports pack1.pack2 to java.compiler;
  }
}
[src1.pack1.pack2] {
[S3]
    package pack1.pack2;
  
  public class S3{}
  
[S1]
    package pack1.pack2;
  
  public class S1{}
  
}
[src1.pack1] {
[S2]
    package pack1;
  
  public class S2{}
  
}
