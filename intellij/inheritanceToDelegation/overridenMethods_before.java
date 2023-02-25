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
    class A extends Base {    
      int fieldFromA;
      public void firstMethodFromBase() {
          super.firstMethodFromBase();
      }
      public void secondMethodFromBase() {
          fieldFromA = 27;
          this.fieldFromA++;
      }
      Base getInstance() {
          return this;
      }
  }
