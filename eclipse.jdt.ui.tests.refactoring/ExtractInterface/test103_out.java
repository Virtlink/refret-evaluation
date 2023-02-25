test;
[p] {
[B]
    package p;
  
  public class B<T>  {
  
  	C f = null;
  }
  
[C]
    
  package p;
  
      
  public enum C implements I {
  	TEST;
  	public void foo () {}
  }
  
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  }
[A]
    package p;
  
  public class A<S> {
  
  	void bar() {
  		B<S> site = null;
  		baz(site.f, site.f);
  	}
  
  	void baz(C filters, I fs) {
  		filters.foo();
  	}
  
  }
  
}
