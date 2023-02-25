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
[A]
    package p;
  
  class A implements I {
  	public void m() {}
  	public void m1() {}
  	void f(Inter i){
  		I a= new A();
  		i.work(a);
  	}
  }
}
