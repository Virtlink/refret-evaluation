test;
[Test]
    public class Test<T> {
    public Test(T t){}
    void foo(){}
    public static void main(T args){
      new Test(args).foo();
    }
  }
