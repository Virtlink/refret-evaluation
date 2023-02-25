test;
[Inner]
    public class Inner
  {
  	/** Comment */
  	private A a;
  
  	Inner(A a) {
  		this.a= a;
  		this.a.f= 1;
  	}
  }
[A]
    class A
  {
  	int f= 0;
  	public A()
  	{
  		super();
  		new Inner(this);
  	}
  }
  
