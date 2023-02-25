test;
[Builder]
    public class Builder<T> {
      private T t;
  
      public Builder setT(T t) {
          this.t = t;
          return this;
      }
  
      public Test createTest() {
          return new Test(t);
      }
  }
[Test]
    public class Test<T> {
    public Test(T t){}
    void foo(){}
    public static void main(T args){
      new Builder().setT(args).createTest().foo();
    }
  }
