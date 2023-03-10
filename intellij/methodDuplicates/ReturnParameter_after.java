test;
[Test]
    class Return {
    private Return myReturn;
    private int myInt;
  
    public Return method(Return p) {
      p.myInt--;
      return p;
    }
  
    public void contextLValue() {
        myReturn = method(myReturn);
        myReturn = null;
    }
  
    public void contextNoUsage() {
        myReturn = method(myReturn);
    }
  
    public void contextRValue() {
        myReturn = method(myReturn);
        Return r = myReturn;
    }
  
    public void contextRValueQualified() {
        myReturn = method(myReturn);
        Return r = this.myReturn;
    }
  }
  
