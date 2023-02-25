test;
[p] {
[Bar]
    package p;
  
  public class Bar {
  
  	public void getDisplay() {}
  
  }
  
[Foo]
    package p;
  
  public class Foo {
  
  	// Test correct "thisification".
  
  	class X extends Bar {
		
  		{
  			Foo.bar(this);
  		}
  	}
  
  	/**
  	 * @param bar
  	 */
  	public static void bar(Bar bar) {
  		bar.getDisplay();
  	}
  }
  
}
