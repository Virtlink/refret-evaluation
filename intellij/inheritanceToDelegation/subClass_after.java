test;
[B]
    public class B extends A {
      void methodFromB() {
          super.delegatedBaseMethod();
      }
  }
  
[DelegatedBase]
    public class DelegatedBase {
      int delegatedBaseField;
  
      void delegatedBaseMethod() {
  
      }
  }
  
[Usage]
    public class Usage {
      public void parameterUsageMethod(DelegatedBase b) {
          b.delegatedBaseMethod();
      }
  
      public int testMethod() {
          A a = new A();
          B b = new B();
          parameterUsageMethod(a.getMyDelegate());
          parameterUsageMethod(b.getMyDelegate());
          a.delegatedBaseMethod();
          b.delegatedBaseMethod();
          a.equals(b);
          return a.getMyDelegate().delegatedBaseField + b.getMyDelegate().delegatedBaseField;
      }
  
      DelegatedBase getDelegatedBase(A a) {
          return a.getMyDelegate();
      }
  }
  
[A]
    public class A {
      private final DelegatedBase myDelegate = new DelegatedBase();
  
      int methodFromA() {
          delegatedBaseMethod();
          return myDelegate.delegatedBaseField;
      }
  
      DelegatedBase getSomething() {
          return myDelegate;
      }
  
      public DelegatedBase getMyDelegate() {
          return myDelegate;
      }
  
      void delegatedBaseMethod() {
          myDelegate.delegatedBaseMethod();
      }
  }
  
