test;
[A]
    public class A {
  
      public void test() {
          Object i = new Object() {
              private int a = 0;
  
              {
                  int j = 5;
                  while (j < 10) j++;
                  a = 1 * j;
              }
          };
      }
  }
  
