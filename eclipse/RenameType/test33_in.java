test;
[p] {
[A]
    package p;
  class A extends Exception{
  }
  class C{
    C() throws A {};
  }
  
}
