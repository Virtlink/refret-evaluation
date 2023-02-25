test;
[p] {
[InheritanceUpdateImplGetterSetter]
    package p;
  
  public class InheritanceUpdateImplGetterSetter extends InheritanceUpdateGetterSetter{
  	protected String test="Test";
  	public void foo() {
  		System.out.println("Test:"+test+" Super:"+super.parameterObject.getTest());
  		parameterObject.setTest2(parameterObject.getTest2() + 1);
  		super.parameterObject.setTest2(super.parameterObject.getTest2() * 2);
  	}
  }
[InheritanceUpdateGetterSetterParameter]
    package p;
  
  public class InheritanceUpdateGetterSetterParameter {
  	private String test;
  	private int test2;
  	public InheritanceUpdateGetterSetterParameter() {
  	}
  	public String getTest() {
  		return test;
  	}
  	public void setTest(String test) {
  		this.test = test;
  	}
  	public int getTest2() {
  		return test2;
  	}
  	public void setTest2(int test2) {
  		this.test2 = test2;
  	}
  }
[InheritanceUpdateGetterSetter]
    package p;
  
  public class InheritanceUpdateGetterSetter {
  	protected InheritanceUpdateGetterSetterParameter parameterObject = new InheritanceUpdateGetterSetterParameter();
  
  	public void foo() {
  		this.parameterObject.setTest(parameterObject.getTest());
  		new InheritanceUpdateGetterSetter().parameterObject.setTest(this.parameterObject.getTest());
  	}
  }
}
