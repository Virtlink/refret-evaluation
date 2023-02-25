test;
[p2] {
[MoreInner]
    package p2;
  class MoreInner {
  
  	{
  		A.Inner.a++;
  	}
  
  }
[A]
    package p2;
  
  public class A {
  
  	static class Inner {
  
  		static int a = 0;
  	}
  
  }
  
}
