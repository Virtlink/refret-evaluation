test;
[p] {
[A]
    //can rename A.m(E[]) to k
  package p;
  
  class A<E> {
      void k(E[] e) {}
      void k(String[] t) {};
  }
  class Sub extends A<String> {
      void k(String... s) {}
  }
}
