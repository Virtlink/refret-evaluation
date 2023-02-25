test;
[Test]
    public class Test {
    public void foo(int a, String b) {}
  
    {
      foo(1, "");
    }
  }
[Param]
    public class Param {
    private String s;
  
    public Param(String s) {
      this.s = s;
    }
  }
