test;
[Test]
    public class Test {
    public void foo(int a, Param param) {}
  
    {
      foo(1, new Param(""));
    }
  }
[Param]
    public class Param {
    private String s;
  
    public Param(String s) {
      this.s = s;
    }
  }
