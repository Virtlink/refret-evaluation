test;
[Test]
    import java.io.*;
  
  class Main {
      void test() {
          System.out.println((Object) "foo");
      }
  }
  
  class Logger {
      private final PrintStream ps;
    
      Logger(PrintStream ps) {
          this.ps = ps;
      }
    
      void log(Object obj) {
          ps.println(obj);
      }
  }
