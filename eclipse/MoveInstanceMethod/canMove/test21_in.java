test;
[p] {
[Second]
    package p;
  class Second {
  	public void foo(Second s) {
  		s.bar();
  	}
  
  	public void bar() {
  	}
  
  	public void go(int i, int j) {
  	}
  }
  
  
[A]
    package p;
  public class A {
  	Second s;
  	Second s2;
  	public void print() {
  		s.foo(s);
  		s.bar();
  		s.go(17, 18);
  
  		equals(this);
  		s.foo(s2);
  		s2.bar();
  	}
  }
  
  
}
