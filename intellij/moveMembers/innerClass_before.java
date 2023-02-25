test;
[B]
    public class B {
      A.Inner i = new A.Inner();
  }
[C]
    public class C {
      A.Inner i = new A.Inner();
  }
[A]
    public class A {
      public static class Inner {
          public boolean equals(Object o) {
              return o instanceof Inner;
          }
      }
  }
