test;
[p1] {
[A1]
    package p1;
  
  import p.A.Inner;
  
  class A1{
  	p.A.Inner a;
  	p.A.Inner.InnerInner a1;
  	Inner a2;
  	Inner.InnerInner a3;
  }
  
}
[p] {
[A]
    package p;
  
  public class A{
  	public static class Inner{
  		public class InnerInner{}
  	}
  }
}
