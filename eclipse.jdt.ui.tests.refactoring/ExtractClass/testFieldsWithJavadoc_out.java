test;
[p] {
[FieldsWithJavadoc]
    package p;
  
  public class FieldsWithJavadoc {
  
  	FieldsWithJavadocData data = new FieldsWithJavadocData();
  }
[FieldsWithJavadocData]
    package p;
  
  public class FieldsWithJavadocData {
  	/**
  	 * the test field
  	 */
  	private String[] test;
  	/** val field */
  	private int[] val;
  	public FieldsWithJavadocData() {
  	}
  	public String[] getTest() {
  		return test;
  	}
  	public void setTest(String[] test) {
  		this.test = test;
  	}
  	public int[] getVal() {
  		return val;
  	}
  	public void setVal(int[] val) {
  		this.val = val;
  	}
  }
}
