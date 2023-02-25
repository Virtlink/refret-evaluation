test;
[p] {
[Second]
    package p;
  class Second {
  	public String str;
  	public void foo(Second s) {
  	}
  	public void print(A a) {
  		foo(this);
  		int s= 17;
  		s= 18;
  		foo(a.s2);
  		a.s2.foo(this);
  		System.out.println(str);
  		a.getClass();
  	}
  }
  
[A]
    package p;
  public class A {
  	Second s;
  	Second s2;
  	public void print() {
  		s.print(this);
  	}
  }
  
  
}
