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
  
  	/**
  	 * Run the test case
  	 * @param tr TODO
  	 */
  	protected void run(TR tr) {
  		tr.startTest(this);
  		P p= new P() {
  			public void protect() throws Throwable {
  				runBare();
  			}
  		};
  		tr.runProtected(this, p);
  			// Some comment
  		tr.endTest(this);
  	}
  }
[TR]
    package p1;
  
  public class TR {
  
  	/**
  	 * Run the test case
  	 * @param test
  	 */
  	protected void run(final TC test) {
  		test.run(this);
  	}
  
  	void runProtected(TC test, P p) {
  	}
  
  	void endTest(TC test) {
  	}
  
  	void startTest(TC test) {
  	}
  
  }
}
