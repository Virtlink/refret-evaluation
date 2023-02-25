test;
[pkg1] {
[B]
    package pkg1;
  
  import java.util.List;
  
  public class B {
  
  	interface Foo {
  
  	}
  
  	static class Bar implements Foo {
  
  		/** baz it! */
  		void baz(final String s) {
  		}
  	}
  }
  
[A]
    package pkg1;
  
  import java.util.List;
  
  public class A implements B.Foo {
  
  	public void b() {
  		List<Object> l = null;
  	}
  }
  
}
