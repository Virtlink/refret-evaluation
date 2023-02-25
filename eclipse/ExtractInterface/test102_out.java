test;
[p] {
[B]
    package p;
  
  public class B  {
  
  	C f = null;
  }
  
[C]
    
  package p;
  
      
  public class C<S, T extends String> implements I<S, T> {
  	public void foo () {}
  }
  
[I]
    package p;
  
  /** typecomment template*/
  public interface I<S, T extends String> {
  
  }
[A]
    package p;
  
  public class A<T> {
  
  	void bar() {
  		B site = null;
  		baz(site.f, site.f);
  	}
  
  	void baz(C filters, I fs) {
  		filters.foo();
  	}
  
  	T wassup() {
  		return null;
  	}
  }
  
}
