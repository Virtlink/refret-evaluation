test;
[Test]
    class Return {
    private Return myReturn;
    public Return getReturn() {
      return myReturn;
    }
    private int myInt;
  
    public Return method() {
      Return r = new Return();
      r.myInt >>= 1;
      return r.getReturn();
    }
  
    public void contextLValue() {
      // Could be processed, but now it is not.
      Return r = new Return();
      r.myInt >>= 1;
      r.getReturn().myInt = 0;
    }
  
    public void contextNoUsage() {
      // Could be processed, but now it is not.
      Return r = new Return();
      r.myInt >>= 1;
    }
  
    public void contextRValue() {
        Return r2 = method();
    }
  }
  
