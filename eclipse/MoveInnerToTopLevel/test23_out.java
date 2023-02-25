test;
[p] {
[Inner]
    package p;
  class Inner{
  }
[A]
    package p;
  public class A {
      Inner inner= new Inner();
  }
}
