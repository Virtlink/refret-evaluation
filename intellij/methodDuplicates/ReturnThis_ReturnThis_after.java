test;
[ReturnThis]
    class Return {
    private int myInt;
  
    public Return method() {
      myInt++;
      return this;
    }
  
    public void context() {
        Return r = method();
        // Currently the statement below could be replaced, but it's not. Nobody has requested this.
      myInt++;
    }
  }
