test;
[p] {
[B]
    package p;
  
  public class B<T>  {
  
  	C f = null;
  }
  
[C]
    
  package p;
  
      
  public enum C {
  	TEST;
  	public void foo () {}
  }
  
[A]
    package p;
  
  public class A<S> {
  
  	void bar() {
  		B<S> site = null;
  		baz(site.f, site.f);
  	}
  
  	void baz(C filters, C fs) {
  		filters.foo();
  	}
  
  }
  
}
