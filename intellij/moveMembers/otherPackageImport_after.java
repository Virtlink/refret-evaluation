test;
[pack2] {
[OtherClass]
    package pack2;
  
  public class OtherClass {
      public static void callee() {
  
      }
  }
}
[pack1] {
[ClassWithStaticMethod]
    package pack1;
  
  import pack2.OtherClass;
  
  public class ClassWithStaticMethod {
  
      public static void main(String[] args) {
          OtherClass.callee();
      }
  
  }
}
