test;
[Base]
    public class Base implements Runnable {
      void firstMethodFromBase() {
      } 
      void secondMethodFromBase() {
      }
      Base getInstance() {
          return null;
      }
      public void run() {
          // do nothing
      }
  }
[A]
    class A {
      private final MyBase myDelegate = new MyBase();
      int fieldFromA;
  
      public void firstMethodFromBase() {
          myDelegate.firstMethodFromBase();
      }
  
      private class MyBase extends Base {
          public void firstMethodFromBase() {
              super.firstMethodFromBase();
          }
  
          public void secondMethodFromBase() {
              fieldFromA = 27;
              A.this.fieldFromA++;
          }
  
          Base getInstance() {
              return this;
          }
      }
  }
