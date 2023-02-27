test;
[p] {
[B]
    package p;

  class B extends [[->C|C|A.C]] {

  }
[A]
    package p;

  class A {
      private static class [[@C|C]] {

      }

  }
}
