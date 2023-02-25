test;
[p2] {
[B]
    package p2;
  public class B{}
  
}
[p3] {
[C]
    package p3;
  import p1.*;
  import p2.B;
  class C{
     Object o = new A();
  }
}
[p1] {
[A]
    package p1;
  public class A{}
  
}
