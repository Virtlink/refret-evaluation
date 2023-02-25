test;
[p] {
[ArrayLengthAccessParameter]
    package p;
  
  public class ArrayLengthAccessParameter {
  	private int test;
  	public ArrayLengthAccessParameter(int test) {
  		this.test = test;
  	}
  	public int getTest() {
  		return test;
  	}
  	public void setTest(int test) {
  		this.test = test;
  	}
  }
[ArrayLengthAccess]
    package p;
  
  public class ArrayLengthAccess {
  	private ArrayLengthAccessParameter parameterObject = new ArrayLengthAccessParameter(new int[0].length);
  }
  
}
