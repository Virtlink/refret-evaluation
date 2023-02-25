test;
[Test]
    class Test {
    private final DebuggerSessionState myState;
  
      public Test() {
      myState = new DebuggerSessionState(EEnum.STATE_STOPPED);
    }
  
    void a() {
      switch (myState.myState) {
        case STATE_STARTED:
          break;
        case STATE_STOPPED:
          break;
      }
    }
  
    private static class DebuggerSessionState {
      final EEnum myState;
    
      public DebuggerSessionState(EEnum state) {
        myState = state;
      }
    }
  }
[EEnum]
    public enum EEnum {
      STATE_STARTED(0), STATE_STOPPED(1);
      private int value;
  
      public int getValue() {
          return value;
      }
  
      EEnum(int value) {
          this.value = value;
      }
  }
