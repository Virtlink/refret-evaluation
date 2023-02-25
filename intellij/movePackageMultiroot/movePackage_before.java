test;
[srcPrefix1] {
[C]
    package pack1.inside;
  
  class C {}
}
[src2.pack1] {
[B]
    package pack2;
  
  class B {
  }
}
[srcPrefix2] {
[D]
    package pack1Unrelated;
  
  class D extends pack1.C {}
}
[src1.pack1] {
[A]
    package pack1;
  
  class A {
  }
}
