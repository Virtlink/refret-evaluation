test;
[XXX]
    public class XXX {
    void foo() {
        new InnerClass().invoke();
    }
  
      private static void bar(int i){}
  
      private class InnerClass {
          public void invoke() {
              int i = 0 ;
              bar(i);
              System.out.println(i);
          }
      }
  }
