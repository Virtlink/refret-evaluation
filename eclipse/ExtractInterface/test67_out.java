test;
[p] {
[Inter]
    package p;
  public interface Inter {
  	void work(I a);
  }
  
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	void m();
  
  }
[Outer]
    package p;
  public class Outer{
  	public static class Implementor implements Inter{	
  		public void work(I a) {}
  	}
  	Implementor implementor;
  	void f(){
  		I a= new A();
  		implementor.work(a);
  	}
  }	
  
[A]
    package p;
  
  class A implements I {
  	public void m() {}
  	public void m1() {}
  }
}
