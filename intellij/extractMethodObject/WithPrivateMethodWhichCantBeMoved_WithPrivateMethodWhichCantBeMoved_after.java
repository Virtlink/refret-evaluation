test;
[WithPrivateMethodWhichCantBeMoved]
    public class XXX {
    void foo() {
        new InnerClass().invoke();
    }
  
      void bazz() {
      bar(0);
    }
  
    private void bar(int i){}
  
      private class InnerClass {
          public void invoke() {
              int i = 0 ;
              bar(i);
              System.out.println(i);
          }
      }
  }
