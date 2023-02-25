test;
[p] {
[A]
    package p;
  class A{
    void m(){
      boolean b = (new A()) instanceof A;
    };
  }
}
