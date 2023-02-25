test;
[p0] {
[NonOriginalSubFoo]
    package p0;
  
  class NonOriginalSubFoo extends VerySuperFoo {
  
  	public void foo() { 
  
  	}
  
  }
  
[VerySuperFoo]
    package p0;
  
  public abstract class VerySuperFoo {
  
  	public abstract void foo();
  
  }
  
[Foo]
    package p0;
  
  import p1.Bar;
  
  public abstract class Foo extends VerySuperFoo {
  
  	{
  		Foo foo= new RealFoo();
  		Bar.bar(foo);				// <-- invoke here		
  	}
  }
  
[RealFoo]
    package p0;
  
  public class RealFoo extends Foo {
  
  	@Override
  	public void foo() {
  	}
  
  }
  
}
[p1] {
[Bar]
    package p1;
  
  import p0.Foo;
  
  public class Bar {
  
  	/**
  	 * @param foo
  	 */
  	public static void bar(Foo foo) {
  		foo.foo();
  	}
  
  }
  
}
