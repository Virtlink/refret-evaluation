test;
[src1] {
[module-info]
    module M {
      exports pack1 to java.base, java.compiler;
  }
}
[src1.pack1.pack2] {
[package-info]
    package pack1.pack2;
}
[src1.pack1] {
[S2]
    package pack1;
  
  public class S2{}
  
[S1]
    package pack1;
  
  public class S1{}
  
}
