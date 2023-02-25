test;
[p] {
[TestInterfaceMethod2Impl]
    package p;
  
  public class TestInterfaceMethod2Impl implements ITestInterfaceMethod {
  
  	public void foo(FooParameter parameterObject) {
  		System.out.println(parameterObject.id+parameterObject.param+parameterObject.blubb);
  	}
  
  }
  
[FooParameter]
    package p;
  
  public class FooParameter {
  	public String id;
  	public int param;
  	public double blubb;
  	public FooParameter(String id, int param, double blubb) {
  		this.id = id;
  		this.param = param;
  		this.blubb = blubb;
  	}
  }
[TestInterfaceMethod]
    package p;
  
  public class TestInterfaceMethod implements ITestInterfaceMethod {
  	/* (non-Javadoc)
  	 * @see p.ITestInterfaceMethod#foo(java.lang.String, int, double)
  	 */
  	public void foo(FooParameter parameterObject){
  		foo(parameterObject);
  	}
  }
  
[ITestInterfaceMethod]
    package p;
  
  public interface ITestInterfaceMethod {
  
  	public abstract void foo(FooParameter parameterObject);
  
  }
  
}
