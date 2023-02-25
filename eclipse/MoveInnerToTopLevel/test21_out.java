test;
[p] {
[Inner]
    package p;
  interface Inner{
      int I= A.i;
  }
[A]
    package p;
  public class A {
      static int i= 0;
  }
  
}
