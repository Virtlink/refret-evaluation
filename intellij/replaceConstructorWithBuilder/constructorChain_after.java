test;
[Builder]
    public class Builder {
      private int i = 2;
  
      public Builder setI(int i) {
          this.i = i;
          return this;
      }
  
      public Test createTest() {
          return new Test(i);
      }
  }
[Test]
    public class Test {
    public Test(int i){}
    public Test(){
      this(2);
    }
    void foo(){}
    public static void main(String[] args){
      new Builder().setI(1).createTest().foo();
    }
  }
