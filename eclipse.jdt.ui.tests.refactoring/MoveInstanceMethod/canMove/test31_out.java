test;
[p1] {
[P]
    package p1;
  public interface P{}
[TC]
    package p1;
  
  import static java.lang.Math.cos;
  import java.util.List;
  
  public class TC {
  	public void runBare() {
  	}
  
  	/**
  	 * Runs the test
  	 * @param tr TODO
  	 */
  	protected void run(final TR tr) {
  		List<Integer> integers= null;
  		tr.startTest(this);
  		P p= new P() {
  			public void protect() throws Throwable {
  				runBare();
  				tr.handleRun(TC.this);
  				double d= cos(0);
  			}
  		};
  		tr.runProtected(this, p);
  
  		tr.endTest(this);
  	}
  }
[TR]
    package p1;
  public enum TR implements P {
  	PASSED, FAILED;
  	/**
  	 * Runs the test
  	 * @param test the test to run
  	 * @deprecated Use {@link p1.TC#run(p1.TR)} instead
  	 */
  	protected void run(final TC test) {
  		test.run(this);
  	}
  
  	void handleRun(TC test) {
  	}
  
  	void runProtected(TC test, P p) {
  	}
  
  	void endTest(TC test) {
  	}
  
  	void startTest(TC test) {
  	}
  
  }
}
