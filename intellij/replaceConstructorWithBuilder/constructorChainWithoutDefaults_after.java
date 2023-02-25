test;
[Builder]
    public class Builder {
      private int i = 2;
      private int j;
  
      public Builder setI(int i) {
          this.i = i;
          return this;
      }
  
      public Builder setJ(int j) {
          this.j = j;
          return this;
      }
  
      public Test createTest() {
          return new Test(i, j);
      }
  }
[Test]
    public class Test {
    public Test(int i, int j){}
    public Test(int j){
      this(2, j);
    }
    void foo(){}
    public static void main(String[] args){
      new Builder().setJ(1).createTest().foo();
      new Builder().setI(2).setJ(3).createTest().foo();
    }
  }
