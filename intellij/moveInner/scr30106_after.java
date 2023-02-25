test;
[p] {
[B]
    package p;
  
  public class B extends X {
      private final A outer;
  
      {
          method();
      }
  
      public B(A outer) {
          this.outer = outer;
      }
  }
  
[X]
    package p;
  
  public class X {
      void method();
  }
[A]
    package p;
  
  public class A extends X {
  }
}
