test;
[A]
    import static java.lang.Math.cos;
  class A extends B
  {
  	private int foo() {return 0};
  	public class Inner
  	{
  		Inner() {
  			int f= foo();
  			int g= bar();
  			double d= cos(0);
  		}
  	}
  
  	public A()
  	{
  		super();
  		new A.Inner();
  	}
  }
  class B extends C {
  }
  class C {
  	protected int bar() {return 0};
  }
