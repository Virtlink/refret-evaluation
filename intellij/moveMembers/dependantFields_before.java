test;
[B]
    public class B {
      public static final String ONE = ""; 
  }
[A]
    public class A {
      void foo(){}
      public static final String TWO = B.ONE + "";
  }
