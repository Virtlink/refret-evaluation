test;
[Test]
    class Test {
      void method(Object x) {
          String s = null;
          s = (String) x;
          final int i = s.length();
          Runnable r = new Runnable() {
              public void run() {
                  System.out.println(i);
              }
          };
          System.out.println(i);
      }
  }
  
