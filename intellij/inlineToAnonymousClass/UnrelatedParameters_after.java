test;
[Test]
    class Test {
  
      abstract class U {
      {
          final int[] args = new int[8];
          Runnable a = new Runnable() {
              {
                  for (int arg : args) {
                    System.out.println(arg);
                  }
              }
  
              @Override
              public void run() {
  
              }
          };
      }
    }
  
  }
