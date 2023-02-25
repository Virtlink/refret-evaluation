test;
[p1] {
[A1]
    package p1;
  import p.A;
  import p.Inner;
  public class A1 {
  	static void f(){
  		Inner i;
  		Inner.foo();
  		Inner.t =  2;
  		p.Inner.foo();
  		p.Inner.t =  2;
  		A a;
  	}
  
  }
}
[p] {
[Inner]
    package p;
  public class Inner{
  	public static void foo() {
  	}
  	public static int t= 1;
  }
[A]
    package p;
  public class A {
  }
}
