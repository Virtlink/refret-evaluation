test;
[B]
    public class B {
  
      static {
      A.ONE = "foo";
    }
  }
[A]
    public class A {
  
      public static final String ONE;
  }
