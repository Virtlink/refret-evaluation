test;
[p1] {
[B]
    package p1;
  import p2.*;
  public class B extends C {
  }
  
[A]
    package p1;
  public class A extends B{
  }
  
}
[p2] {
[C]
    package p2;
  public class C {
  }
  
}
