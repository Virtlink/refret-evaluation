test;
[ParamSimple]
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
  
