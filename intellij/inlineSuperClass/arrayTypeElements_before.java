test;
[Super]
    class Super {
    public Super(String s) {
    }
  
    public static Super[] getArray() {
      return new Super[0];
    }
  
    public static Super[] getArrayWithInitializer() {
      return new Super[]{};
    }
  
  }
[Test]
    class Test extends Super {
    public Test() {
      super("");
    }
  }
