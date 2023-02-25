test;
[Super]
    class A implements I {
    A(int i) {
      System.out.println(i);
    }
  }
  
  interface Super {}
  
[Test]
    abstract class Test extends A implements Super {
    public Test(boolean mode) {
      super(mode? 1: 0);
    }
  }
