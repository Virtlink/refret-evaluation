test;
[p] {
[TestDelegateCreationCodeStyle]
    package p;
  
  class TestDelegateCreationA {
  	int b;
  }
  
  public class TestDelegateCreationCodeStyle extends TestDelegateCreationA{
  	String a[];
  	public void foo(String[] a, int b, double d){
  		a=new String[0];
  		d=5.7;
  		b=6;
  	}
  }
  
}
