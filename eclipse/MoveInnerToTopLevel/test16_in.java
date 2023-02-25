test;
[p1] {
[A1]
    package p1;
  import p.A;
  public class A1 {
  	static void f(){
  		A.Inner i;
  		A.Inner.foo();
  		A.Inner.t =  2;
  		p.A.Inner.foo();
  		p.A.Inner.t =  2;
  		A a;
  	}
  
  }
}
[p] {
[A]
    package p;
  public class A {
  	public static class Inner{
  		public static void foo() {
  		}
  		public static int t= 1;
  	}
  }
}
