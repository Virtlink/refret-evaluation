test;
[A]
    public class A {
  
      public void test() {
          int c = 0;
          Runnable i = new Runnable() {
              private final int c = 1;
  
              public void run() {
                  System.out.println(c);
              }
          };
          new Thread(i).start();
      }
  }
  
