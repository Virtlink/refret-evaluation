test;
[Model]
    public class Model {
    public static final Runnable FOO = new Runnable() {
      public void run() {
        System.out.println("abc");
      }
    };
  
    public void foo() {
      FOO.run();
    }
  }
  
