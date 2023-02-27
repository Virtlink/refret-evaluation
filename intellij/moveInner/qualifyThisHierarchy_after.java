test;
[pack1] {
[MyRunnable]
    package pack1;

  public class MyRunnable {
      private final DImpl [[@2|d]];

      public MyRunnable(DImpl d) {
          this.d = d;
      }

      public void run() {
      [[->1|&2|iAmProtected|d.iAmProtected]]();
    }
  }

[DImpl]
    package pack1;
  class D {
    protected void [[@1|iAmProtected]]() {
    }
  }

  public class DImpl extends D {
  }


}
