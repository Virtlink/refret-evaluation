test;
[Test]
    class Return {
    private Return myReturn;
    private int myInt;
  
    public Return method() {
      Return r = new Return();
      r.myInt >>= 1;
      return r;
    }
  
    public void contextLValue() {
        Return r = method();
        r = null;
    }
  
    public void contextNoUsage() {
        Return r = method();
    }
  
    public void contextRValue() {
        Return r = method();
        Return r2 = r;
    }
  }
  
