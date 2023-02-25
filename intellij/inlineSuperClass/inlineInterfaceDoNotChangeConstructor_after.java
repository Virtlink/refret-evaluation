test;
[Super]
    class A implements I {
    A(int i) {
      System.out.println(i);
    }
  }
  
  
[Test]
    abstract class Test extends A {
    public Test(boolean mode) {
      super(mode? 1: 0);
    }
  }
