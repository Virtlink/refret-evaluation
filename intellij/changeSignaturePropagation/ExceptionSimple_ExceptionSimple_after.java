test;
[ExceptionSimple]
    class ChangeSignatureTest {
      void foo() throws Exception {
      }
  
      void bar() throws Exception {
        foo();
      }
  
      {
          try {
              bar();
          } catch (Exception e) {
              throw new RuntimeException(e);
          }
      }
  }
