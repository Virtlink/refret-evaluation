test;
[p] {
[SwitchCaseUpdates]
    package p;
  
  public class SwitchCaseUpdates {
  	private SwitchCaseUpdatesParameter parameterObject = new SwitchCaseUpdatesParameter();
  	private void foo() {
  		switch (parameterObject.getTest()) {
  		case 5: parameterObject.setTest(7);
  				break;
  		case 7: parameterObject.setTest(5);
  		}
  	}
  }
  
[SwitchCaseUpdatesParameter]
    package p;
  
  public class SwitchCaseUpdatesParameter {
  	private int test;
  	public SwitchCaseUpdatesParameter() {
  	}
  	public int getTest() {
  		return test;
  	}
  	public void setTest(int test) {
  		this.test = test;
  	}
  }
}
