test;
[pack2] {
[AnotherClass]
    package pack2;
  
  import pack1.OuterClass;
  
  class AnotherClass {
    OuterClass.NewInnerClass inner = new OuterClass.NewInnerClass();
  }
}
[pack1] {
[OuterClass]
    package pack1;
  
  public class OuterClass {
      public static class NewInnerClass {
        
      }
   
      String classLoaderString = "pack1.OuterClass$NewInnerClass";
  }
}
