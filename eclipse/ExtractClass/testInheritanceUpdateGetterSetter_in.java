test;
[p] {
[InheritanceUpdateImplGetterSetter]
    package p;
  
  public class InheritanceUpdateImplGetterSetter extends InheritanceUpdateGetterSetter{
  	protected String test="Test";
  	public void foo() {
  		System.out.println("Test:"+test+" Super:"+super.test);
  		test2++;
  		super.test2*=2;
  	}
  }
[InheritanceUpdateGetterSetter]
    package p;
  
  public class InheritanceUpdateGetterSetter {
  	protected String test;
  	protected int test2;
  
  	public void foo() {
  		this.test=test;
  		new InheritanceUpdateGetterSetter().test=this.test;
  	}
  }
}
