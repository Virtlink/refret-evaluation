test;
[Test]
    import javax.swing.*;
  import java.io.InputStream;
  import java.io.PrintStream;
  
  abstract class A {
    protected PrintStream myPrinter;
  
    protected void fooBar() {
      myPrinter.println("hello");
    }
  }
  
  class B extends A {
    public void foo() {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            fooBar();
        }
      });
    }
  }
  
