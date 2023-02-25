test;
[p] {
[B]
    package p;
  
  public class B  {
  
  	C f = null;
  }
  
[C]
    
  package p;
  
      
  public class C<S, T extends String> {
  	public void foo () {}
  }
  
[A]
    package p;
  
  public class A<T> {
  
  	void bar() {
  		B site = null;
  		baz(site.f, site.f);
  	}
  
  	void baz(C filters, C fs) {
  		filters.foo();
  	}
  
  	T wassup() {
  		return null;
  	}
  }
  
}
