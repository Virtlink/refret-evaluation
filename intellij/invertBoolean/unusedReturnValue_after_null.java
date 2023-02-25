test;
[unusedReturnValue]
    class C {
    boolean fooInverted() {
      return true;
    }
  
    void bar() {
      fooInverted();
    }
  }
  
