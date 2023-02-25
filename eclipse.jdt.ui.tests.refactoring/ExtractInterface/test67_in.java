test;
[p] {
[Inter]
    package p;
  public interface Inter {
  	void work(A a);
  }
  
[Outer]
    package p;
  public class Outer{
  	public static class Implementor implements Inter{	
  		public void work(A a) {}
  	}
  	Implementor implementor;
  	void f(){
  		A a= new A();
  		implementor.work(a);
  	}
  }	
  
[A]
    package p;
  
  class A {
  	public void m() {}
  	public void m1() {}
  }
}
