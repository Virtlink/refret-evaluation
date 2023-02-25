test;
[p] {
[B]
    package p;
  class B extends Exception{
  }
  class C{
    C() throws B {};
  }
  
}
