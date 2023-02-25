test;
[p] {
[TestImportAddEnclosing]
    package p;
  
  import java.security.Permission;
  
  public class TestImportAddEnclosing {
  	public static class FooParameter {
  		public Permission[] permissions;
  		public int b;
  		public FooParameter(Permission[] permissions, int b) {
  			this.permissions = permissions;
  			this.b = b;
  		}
  	}
  
  	public void foo(FooParameter parameterObject){
		
  	}
  }
  
[TestImportAddEnclosingCaller]
    package p;
  
  import java.security.Permission;
  
  import p.TestImportAddEnclosing.FooParameter;
  
  public class TestImportAddEnclosingCaller {
  	public void foo(){
  		new TestImportAddEnclosing().foo(new FooParameter(new Permission[0], 7));
  	}
  }
  
}
