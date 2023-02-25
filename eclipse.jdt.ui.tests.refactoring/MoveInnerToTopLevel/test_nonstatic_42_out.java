test;
[p] {
[Inner]
    package p;
  
  import static java.lang.Math.cos;
  import p.A.Stat;
  
  class Inner {
  	static class InnerInner {
  		static class InnerInnerInner {}
  	}
  	public void doit() {
  		A.foo();
  		A.fred++;
  		double d= cos(0);
  		new Stat();
  	}
  }
[A]
    package p;
  public class A {
  	static void foo(){};
  	static int fred;
  	static class Stat{}
  }
}
