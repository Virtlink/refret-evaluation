test;
[B]
    public class B {
      {
          Object o = A.ONE;
      }
  }
[A]
    public enum A {
      ONE("");
    A(String s){}
  }
