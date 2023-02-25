test;
[p] {
[TestImportAddEnclosing]
    package p;
  
  import java.security.Permission;
  
  public class TestImportAddEnclosing {
  	public void foo(Permission[] a, int b){
		
  	}
  }
  
[TestImportAddEnclosingCaller]
    package p;
  
  import java.security.Permission;
  
  public class TestImportAddEnclosingCaller {
  	public void foo(){
  		new TestImportAddEnclosing().foo(new Permission[0], 7);
  	}
  }
  
}
