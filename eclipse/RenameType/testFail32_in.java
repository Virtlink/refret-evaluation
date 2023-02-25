test;
[p1] {
[B]
    package p1;
  public class B{}
}
[p] {
[A]
    package p;
  import p1.*;
  public class A{
     Object o = new B();
  }
}
