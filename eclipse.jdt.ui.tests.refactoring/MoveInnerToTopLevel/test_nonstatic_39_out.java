test;
[p] {
[Inner]
    package p;
  
  import p.A.Stat;
  
  class Inner {
  	public void doit() {
  		A.foo();
  		A.fred++;
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
