test;
[Test]
    class Mapping {
    private int myInt;
  
    public void method(boolean b, int i, char c, double d, int[] ia, String s) {
      myInt = b ? i + c - (int)d: ia.length + s.hashCode();
    }
  
    public void context() {
        method(true || false, 5, 'z', 3.14, new int[] { 0, 1 }, "abc");
    }
  }
  
