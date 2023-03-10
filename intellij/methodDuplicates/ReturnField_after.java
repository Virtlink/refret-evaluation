test;
[Test]
    class Return {
    private Return myReturn;
    private int myInt;
  
    public Return method() {
      myReturn = new Return();
      myReturn.myInt++;
      return myReturn;
    }
  
    public void contextLValue() {
        myReturn = method();
        myReturn = null;
    }
  
    public void contextNoUsage() {
        myReturn = method();
    }
  
    public void contextRValue() {
        myReturn = method();
        Return r = myReturn;
    }
  
    public void contextRValueQualified() {
        myReturn = method();
        Return r = this.myReturn;
    }
  }
  
