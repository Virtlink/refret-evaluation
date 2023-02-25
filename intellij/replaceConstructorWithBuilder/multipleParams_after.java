test;
[Builder]
    public class Builder {
      private int j;
      private int[] i;
  
      public Builder setJ(int j) {
          this.j = j;
          return this;
      }
  
      public Builder setI(int... i) {
          this.i = i;
          return this;
      }
  
      public Test createTest() {
          return new Test(j, i);
      }
  }
[Test]
    public class Test {
    public Test(int j, int... i){}
    void foo(){}
    public static void main(String[] args){
      new Builder().setJ(1).setI(2, 3).createTest().foo();
    }
  }
