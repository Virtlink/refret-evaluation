test;
[pack2] {
[OtherClass]
    package pack2;
  
  public class OtherClass {
  }
}
[pack1] {
[ClassWithStaticMethod]
    package pack1;
  
  public class ClassWithStaticMethod {
  
      public static void main(String[] args) {
          callee();
      }
  
      public static void callee() {
  
      }
  }
}
