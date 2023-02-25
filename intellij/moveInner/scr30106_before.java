test;
[p] {
[X]
    package p;
  
  public class X {
      void method();
  }
[A]
    package p;
  
  public class A extends X {
      public class B extends X {
          {
              method();
          }
      }
  }
}
