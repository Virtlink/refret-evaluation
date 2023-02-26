test;
[pack1] {
[MyRunnable]
    package pack1;
  
  public class MyRunnable {
      private final DImpl d;
  
      public MyRunnable(DImpl d) {
          this.d = d;
      }
  
      public void run() {
      d.iAmProtected();
    }
  }
  
[DImpl]
    package pack1;
  class D {
    protected void iAmProtected() {
    }
  }
  
  public class DImpl extends D {
  }
  
  
}