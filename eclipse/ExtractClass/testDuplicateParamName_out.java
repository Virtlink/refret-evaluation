test;
[p] {
[DuplicateParamNameParameter]
    package p;
  
  public class DuplicateParamNameParameter {
  	private String fHTest;
  	private String fGTest;
  	public DuplicateParamNameParameter(String hTest, String gTest) {
  		fHTest = hTest;
  		fGTest = gTest;
  	}
  	public String getHTest() {
  		return fHTest;
  	}
  	public void setHTest(String hTest) {
  		fHTest = hTest;
  	}
  	public String getGTest() {
  		return fGTest;
  	}
  	public void setGTest(String gTest) {
  		fGTest = gTest;
  	}
  }
[DuplicateParamName]
    package p;
  
  public class DuplicateParamName {
  	private DuplicateParamNameParameter parameterObject = new DuplicateParamNameParameter(foo(), foo());
  	private String foo() {
  		return "Foo";
  	}
  }
  
}
