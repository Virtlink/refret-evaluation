test;
[Test]
    enum G {
    VALUE(100),
    REF(VALUE.myGetGet);
  
    private final int myGetGet;
  
    G(final int groupNumber) {
      myGetGet = groupNumber;
    }
  
  }
