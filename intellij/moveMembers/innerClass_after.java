test;
[B]
    public class B {
      Inner i = new Inner();
  
      public static class Inner {
          public boolean equals(Object o) {
              return o instanceof Inner;
          }
      }
  }
[C]
    public class C {
      B.Inner i = new B.Inner();
  }
[A]
    public class A {
  }
