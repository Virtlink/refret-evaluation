test;
[ParamWithOverriding]
    class ChangeSignatureTest {
      public ChangeSignatureTest(Class clazz) {
      }
  
      void foo(Class clazz) {
          new ChangeSignatureTest(clazz);
      }
  
      {
        foo(null);
      }
  }
  
  class Derived extends ChangeSignatureTest {
      Derived() {
          super(null);
      }
  
      void foo (Class clazz) {}
  }
