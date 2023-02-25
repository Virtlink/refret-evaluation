test;
[p2] {
[AA]
    package p2;
  import p1.*;
  class AA extends A{}
  class B extends AA{} 
}
[p1] {
[A]
    package p1;
  public class A{
  } 
}
