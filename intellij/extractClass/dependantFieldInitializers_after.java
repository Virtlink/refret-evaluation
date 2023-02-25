test;
[Test]
    class Test {
    static final int ii = 1;
  }
[Extracted]
    public class Extracted {
      static final int[] myT;
  
      public Extracted() {
          this.myT = new int[]{Test.ii};
      }
  }
