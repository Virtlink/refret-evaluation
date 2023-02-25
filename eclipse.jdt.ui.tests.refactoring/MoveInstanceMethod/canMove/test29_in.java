test;
[p1] {
[P]
    package p1;
  public interface P{}
[TC]
    package p1;
  public class TC {
  	public void runBare() {
  	}
  }
[TR]
    package p1;
  import java.util.List;
  public enum TR implements P {
  	PASSED, FAILED;
  	/**
  	 * Runs the test
  	 * @param test the test to run
  	 */
  	protected void run(final TC test) {
  		List<Integer> integers= null;
  		startTest(test);
  		P p= new P() {
  			public void protect() throws Throwable {
  				test.runBare();
  				handleRun(test);
  			}
  		};
  		runProtected(test, p);
  
  		endTest(test);
  	}
  
  	private void handleRun(TC test) {
  	}
  
  	private void runProtected(TC test, P p) {
  	}
  
  	private void endTest(TC test) {
  	}
  
  	private void startTest(TC test) {
  	}
  
  }
}
