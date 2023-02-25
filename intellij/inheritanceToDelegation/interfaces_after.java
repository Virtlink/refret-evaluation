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
          return myA.getMyDelegate();
      }
  
      public void methodExpectingJ(J j) {
          j.methodFromJ();
      }
  
      public void main() {
          A a = new A();
          a.methodFromI();
          a.getMyDelegate().methodFromJ();
          methodExpectingI(a);
          methodExpectingJ(a.getMyDelegate());
          methodExpectingJ(myA.getMyDelegate());
      }
  }
[A]
    public class A implements I {
      private final Base myDelegate = new Base();
  
      public Base getMyDelegate() {
          return myDelegate;
      }
  
      public void methodFromI() {
          myDelegate.methodFromI();
      }
  }
