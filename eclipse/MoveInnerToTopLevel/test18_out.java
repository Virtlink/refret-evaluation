test;
[p1] {
[A1]
    package p1;
  
  import p.Inner;
  
  class A1{
  	p.Inner a;
  	p.Inner.InnerInner a1;
  	Inner a2;
  	Inner.InnerInner a3;
  }
  
}
[p] {
[Inner]
    package p;
  public class Inner{
  	public class InnerInner{}
  }
[A]
    package p;
  
  public class A{
  }
}
