test;
[NoReturnTypesSuggested]
    class X {
    void foo() {
        newMethod();
  
    }
  
      private int newMethod() {
          if (true) return;
          System.out.println();
      }
  }
  
