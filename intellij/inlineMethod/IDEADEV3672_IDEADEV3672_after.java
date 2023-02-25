test;
[IDEADEV3672]
    class Tester1 {
      void caller() {
          new Runnable() {
              public void run() {
                  other();
              }
          };
      }
  
      void other() { }
  }
