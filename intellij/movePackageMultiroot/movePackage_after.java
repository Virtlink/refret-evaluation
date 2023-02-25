test;
[srcPrefix1] {
[C]
    package target.pack1.inside;
  
  class C {}
}
[src2.target.pack1] {
[B]
    package pack2;
  
  class B {
  }
}
[srcPrefix2] {
[D]
    package pack1Unrelated;
  
  class D extends target.pack1.C {}
}
[src1.target.pack1] {
[A]
    package target.pack1;
  
  class A {
  }
}
