test;
[p] {
[TestInterfaceMethod2Impl]
    package p;
  
  public class TestInterfaceMethod2Impl implements ITestInterfaceMethod {
  
  	public void foo(String id, int param, double blubb) {
  		System.out.println(id+param+blubb);
  	}
  
  }
  
[TestInterfaceMethod]
    package p;
  
  public class TestInterfaceMethod implements ITestInterfaceMethod {
  	/* (non-Javadoc)
  	 * @see p.ITestInterfaceMethod#foo(java.lang.String, int, double)
  	 */
  	public void foo(String id, int param, double blubb){
  		foo(id,param,blubb);
  	}
  }
  
[ITestInterfaceMethod]
    package p;
  
  public interface ITestInterfaceMethod {
  
  	public abstract void foo(String id, int param, double blubb);
  
  }
  
}
