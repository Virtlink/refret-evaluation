test;
[pack1] {
[Class1]
    package pack1;
  
  public class Class1 {
  }
  
[Class2]
    package pack1;
  
  public class Class2 {
     Class1 c1;
  }
  
[A]
    package pack1;
  
  public class A {
    private static class PrivateInner {
    }
  }
  
}
