test;
[p] {
[VariableDeclarationInitializerParameter]
    package p;
  
  public class VariableDeclarationInitializerParameter {
  	private int test;
  	public VariableDeclarationInitializerParameter(int test) {
  		this.test = test;
  	}
  	public int getTest() {
  		return test;
  	}
  	public void setTest(int test) {
  		this.test = test;
  	}
  }
[VariableDeclarationInitializer]
    package p;
  
  public class VariableDeclarationInitializer {
  	private VariableDeclarationInitializerParameter parameterObject = new VariableDeclarationInitializerParameter(5);
  
  	public void foo() {
  		int x = parameterObject.getTest();
  		int test = this.parameterObject.getTest();
  	}
  }
}
