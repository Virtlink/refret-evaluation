test;
[A]
    import java.io.*;
  
  public class A_testCatchClause_in {
      public void f(File f) {
          try {
              FileInputStream is = new FileInputStream(f);
          } catch (FileNotFoundException ex) {
              System.err.println("file not found");
          }
      }
  }
  
