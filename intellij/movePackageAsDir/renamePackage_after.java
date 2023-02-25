test;
[src1] {
[module-info]
    module M {
    exports pack1.pack2;
    opens pack1.pack2;
  }
}
[src1.pack1.pack2] {
[S1]
    package pack1.pack2;
  
  public class S1{}
  
}
