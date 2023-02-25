test;
[p] {
[InnerDocumentedClass]
    package p;
  
  public class InnerDocumentedClass {
  	/* This comment is really important
  	 * because it will cause the 
  	 * sourceRange to be different
  	 */
  	public class InnerClass {
  		private InnerClassParameter parameterObject = new InnerClassParameter();
  	}
  }
  
[InnerClassParameter]
    package p;
  
  public class InnerClassParameter {
  	private int foo;
  	public InnerClassParameter() {
  	}
  	public int getFoo() {
  		return foo;
  	}
  	public void setFoo(int foo) {
  		this.foo = foo;
  	}
  }
}
