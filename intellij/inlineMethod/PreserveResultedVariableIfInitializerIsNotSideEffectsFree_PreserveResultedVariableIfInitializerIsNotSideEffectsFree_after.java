test;
[PreserveResultedVariableIfInitializerIsNotSideEffectsFree]
    class Main {
  
    private int sideEffectCounter;
  
  
    public Main() {
  
      this.sideEffectCounter = 1;
    }
  
    private Object checkNullnessAndGet(Object obj) {
      return obj == null ? fooBar() : null;
    }
  
    private Object fooBar() {
      sideEffectCounter++;
      return null;
    }
  
    public final void doSomething(Object obj) {
      try {
          if (null == null) {
              fooBar();
          }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  
  }
