test;
[p0] {
[NonOriginalSubFoo]
    package p0;
  
  class NonOriginalSubFoo extends VerySuperFoo {
  
  	protected void foo() { 
  
  	}
  
  }
  
[VerySuperFoo]
    package p0;
  
  public abstract class VerySuperFoo {
  
  	protected abstract void foo();
  
  }
  
[Foo]
    package p0;
  
  abstract class Foo extends VerySuperFoo {
  
  	{
  		Foo foo= new RealFoo();
  		foo.foo();				// <-- invoke here		
  	}
  }
  
[RealFoo]
    package p0;
  
  public class RealFoo extends Foo {
  
  	@Override
  	protected void foo() {
  	}
  
  }
  
}
[p1] {
[Bar]
    package p1;
  
  class Bar {
  
  }
  
}
