test;
[p] {
[B]
    package p;
  public class B{
   public class X{}
  };
}
[p1] {
[C]
    package p1;
  import p.B.*;
  class C{}; 
}
