test;
[Super]
    class Super {
    private final String field;
  
    public Super() {
      field = "text";
    }
  
  }
[Test]
    class Test extends Super{
    Test(){
      super();
    }
  }
