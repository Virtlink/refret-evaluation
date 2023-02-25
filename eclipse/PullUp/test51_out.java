test;
[pkg1] {
[B]
    package pkg1;
  
  import java.util.List;
  
  public class B {
  
  	interface Foo {
  
  		void b();
  
  	}
  
  	static class Bar implements Foo {
  
  		/** baz it! */
  		void baz(final String s) {
  		}
  
  		@Override
  		public void b() {
  			// TODO Auto-generated method stub
			
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
