test;
[Base]
    public class Base implements I, J {
      public void methodFromI() {
      }
   
      public void methodFromJ() {
      }
  }
[I]
    public interface I {
      void methodFromI();
  }
[J]
    public interface J {
      void methodFromJ();
  }
[Usage]
    class Usage {
      private A myA = new A();
      public void methodExpectingI(I i) {
          i.methodFromI();
      }
  
      public J methodReturningJ() {
          return myA;
      }
  
      public void methodExpectingJ(J j) {
          j.methodFromJ();
      }
  
      public void main() {
          A a = new A();
          a.methodFromI();
          a.methodFromJ();
          methodExpectingI(a);
          methodExpectingJ(a);
          methodExpectingJ(myA);
      }
  }
[A]
    public class A extends Base {
  }
