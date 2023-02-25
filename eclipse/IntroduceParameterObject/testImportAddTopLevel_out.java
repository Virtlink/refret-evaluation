test;
[p.parameters] {
[TestImportAddTopLevelParameter]
    package p.parameters;
  
  import java.security.Permission;
  
  public class TestImportAddTopLevelParameter {
  	public Permission[] a;
  	public int b;
  	public TestImportAddTopLevelParameter(Permission[] a, int b) {
  		this.a = a;
  		this.b = b;
  	}
  }
}
[p.sub] {
[TestImportAddTopLevelCaller]
    package p.sub;
  
  import java.security.Permission;
  
  import p.parameters.TestImportAddTopLevelParameter;
  
  public class TestImportAddTopLevelCaller {
  	public void foo(){
  		new p.TestImportAddTopLevel().foo(new TestImportAddTopLevelParameter(new Permission[0], 99));
  	}
  }
  
}
[p] {
[TestImportAddTopLevel]
    package p;
  
  import p.parameters.TestImportAddTopLevelParameter;
  
  public class TestImportAddTopLevel {
  	public void foo(TestImportAddTopLevelParameter parameterObject){
		
  	}
  }
  
}
