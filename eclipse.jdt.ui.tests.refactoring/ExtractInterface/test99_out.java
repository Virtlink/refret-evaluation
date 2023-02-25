test;
[p] {
[B]
    package p;
  
  public class B  {
  
  	C f = null;
  }
  
[C]
    
  package p;
  
      
  public class C implements I {
  	public void foo () {}
  }
  
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  }
[A]
    package p;
  
  public class A {
  
  	void bar() {
  		B site = null;
  		baz(site.f, site.f);
  	}
  
  	void baz(C filters, I fs) {
  		filters.foo();
  	}
  
  }
  
}
