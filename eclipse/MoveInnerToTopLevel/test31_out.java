test;
[Inner]
    import static java.lang.Math.cos;
  
  public class Inner
  {
  	/** Comment */
  	private A a
  
  	Inner(A a) {
  		this.a= a;
  		int f= this.a.foo();
  		int g= this.a.bar();
  		double d= cos(0);
  	}
  }
  
[A]
    class A extends B
  {
  	int foo() {return 0);
  	public A()
  	{
  		super();
  		new Inner(this);
  	}
  }
  class B extends C {
  }
  class C {
  	protected int bar() {return 0};
  }
