test;
[p] {
[B]
    package p;
  
  public class B  {
  
  	C f = null;
  }
  
[C]
    
  package p;
  
      
  public enum C implements I {
  	PROBE;
  	public void foo () {}
  }
  
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  }
[A]
    package p;
  
  public enum A {
  	TEST;
  	void bar() {
  		B site = null;
  		baz(site.f, site.f);
  	}
  
  	void baz(C filters, I fs) {
  		filters.foo();
  	}
  
  }
  
}
