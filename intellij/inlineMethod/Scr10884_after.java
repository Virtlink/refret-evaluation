test;
[Scr10884]
    public class Scr10884 {
      Y bar() {
          return new Y(1) {
  	    };
          }
  }
  
  class Y {
          Y(int x) {}
          int foo() {
                  return 2;
          }
  }
