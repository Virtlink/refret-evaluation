test;
[p1] {
[TC]
    package p1;
  public class TC {
  
  	/**
  	 * Runs the test case
  	 * @param tr TODO
  	 */
  	protected void run(TR tr) {
  		tr.startTest(this);
  	}
  }
[TR]
    package p1;
  
  public class TR {
  
  	/**
  	 * Runs the test case
  	 * @param test
  	 */
  	protected void run(TC test) {
  		test.run(this);
  	}
  
  	void startTest(TC test) {
  	}
  
  }
}
