test;
[p.sub] {
[TestImportAddTopLevelCaller]
    package p.sub;
  
  import java.security.Permission;
  
  public class TestImportAddTopLevelCaller {
  	public void foo(){
  		new p.TestImportAddTopLevel().foo(new Permission[0], 99);
  	}
  }
  
}
[p] {
[TestImportAddTopLevel]
    package p;
  
  import java.security.Permission;
  
  public class TestImportAddTopLevel {
  	public void foo(Permission[] a, int b){
		
  	}
  }
  
}
