test;
[Builder]
    public class Builder {
      private int[] i;
  
      public void setI(int... i) {
          this.i = i;
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
      new Test(1, 2, 3).foo();
    }
  }
