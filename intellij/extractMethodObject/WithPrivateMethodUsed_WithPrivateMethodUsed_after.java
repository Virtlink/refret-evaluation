test;
[WithPrivateMethodUsed]
    public class XXX {
    void foo() {
        new InnerClass().invoke();
    }
  
      private class InnerClass {
          public void invoke() {
              int i = 0 ;
              bar(i);
              System.out.println(i);
          }
  
          private void bar(int i){}
      }
  }
