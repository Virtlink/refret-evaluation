test;
[Parent]
    public class Parent {
    void execute(){}
  }
  
  class Child extends Parent {
    void foo() {
        execute();
        new Runnable() {
        public void run() {
            execute();
        }
      }.run();
    }
  
    class InnerChild {
      void bar() {
          execute();
      }
    }
  }
