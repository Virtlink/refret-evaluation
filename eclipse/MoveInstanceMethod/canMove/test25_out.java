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
  
  	protected void run(final TR tr) {
  		tr.startTest(this);
  		P p= new P() {
  			public void protect() throws Throwable {
  				runBare();
  				tr.handleRun(TC.this);
  			}
  		};
  		tr.runProtected(this, p);
  
  		tr.endTest(this);
  	}
  }
[TR]
    package p1;
  
  public class TR {
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
