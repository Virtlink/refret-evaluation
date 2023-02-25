test;
[ArrayList]
    
  public class ArrayList {
  	public int xer;
  	public int yer;
  	public ArrayList(int xer, int yer) {
  		this.xer = xer;
  		this.yer = yer;
  	}
  }
[TestDefaultPackagePointTopLevel]
    
  public class TestDefaultPackagePointTopLevel {
  	public static void main(String[] args) {
  		new TestDefaultPackagePointTopLevel().foo(new ArrayList(5, 6));
  	}
  	public void foo(ArrayList parameterObject){
  		System.out.println(parameterObject.xer+parameterObject.yer);
  	}
  }
  
