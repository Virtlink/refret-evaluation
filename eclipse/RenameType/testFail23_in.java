test;
[p3] {
[B]
    package p3;
  public class B{} 
}
[p2] {
[Bogus]
    package p2;
  import p1.A;
  import p3.B;
  class Bogus{} 
}
[p1] {
[A]
    package p1;
  public class A{} 
}
