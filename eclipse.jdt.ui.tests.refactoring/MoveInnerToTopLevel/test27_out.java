test;
[Inner]
    
  public class Inner
  {
  	/** Comment */
  	private A a
  
  	Inner(A a) {
  		this.a= a;
  		int f= this.a.foo();
  	}
  }
  
[A]
    class A
  {
  	int foo() {return 0};
  	public A()
  	{
  		super();
  		new Inner(this);
  	}
  }
  
