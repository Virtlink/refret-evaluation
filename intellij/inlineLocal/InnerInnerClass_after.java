test;
[In]
    public class In {
  
      void fool() {
          new Runnable() {
              public void run() {
                  new Runnable() {
                      public void run() {
                          if (narr()) {
  
                          }
                      }
                  }.run();
              }
          };
      }
  
      boolean narr() {
          return false;
      }
  }
  
