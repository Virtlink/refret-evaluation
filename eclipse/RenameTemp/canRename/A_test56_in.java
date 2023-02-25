test;
[p] {
[A]
    package p;
  class A<S extends Number & Cloneable> {
      void m(S /*[*/arg/*]*/) {
          arg.byteValue();
      }
  }
}
