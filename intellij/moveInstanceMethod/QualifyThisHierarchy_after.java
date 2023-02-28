test;
[D]
    public class D {
    protected void [[@1|iAmProtected]]() {
    }
  }

  class DImpl extends D {
  }

  class F {

      void foo(D [[@2|d]]) {
        class MyRunnable {
          public void run() {
            [[->1|&2|iAmProtected()|d.iAmProtected()]];
          }
        }
      }
  }
