test;
[XXX]
    public class XXX {
    static void foo() {
        InnerClass.invoke();
    }
  
      private static class InnerClass {
          private static void invoke() {
              int i = 0 ;
              bar(i);
              System.out.println(i);
          }
  
          private static void bar(int i){}
      }
  }
