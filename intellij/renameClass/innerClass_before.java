test;
[pack2] {
[AnotherClass]
    package pack2;
  
  import pack1.OuterClass;
  
  class AnotherClass {
    OuterClass.InnerClass inner = new OuterClass.InnerClass();
  }
}
[pack1] {
[OuterClass]
    package pack1;
  
  public class OuterClass {
      public static class InnerClass {
        
      }
   
      String classLoaderString = "pack1.OuterClass$InnerClass";
  }
}
