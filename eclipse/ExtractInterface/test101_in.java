test;
[p] {
[B]
    package p;
  
  public class B  {
  
  	C f = null;
  }
  
[C]
    
  package p;
  
      
  public enum C {
  	PROBE;
  	public void foo () {}
  }
  
[A]
    package p;
  
  public enum A {
  	TEST;
  	void bar() {
  		B site = null;
  		baz(site.f, site.f);
  	}
  
  	void baz(C filters, C fs) {
  		filters.foo();
  	}
  
  }
  
}
