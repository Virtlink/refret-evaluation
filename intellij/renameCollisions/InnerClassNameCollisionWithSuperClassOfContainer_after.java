test;
[Test]
    
  interface ITest {
    void handleAction(Object o);
  }
  
  
  class Test implements ITest{
  
    public void handleAction(Object o) {
    }
  
    private class ActionHandler {
      public void handleAction(Object o, Object o1) {
        Test.this.handleAction(o);
      }
    }
  }
