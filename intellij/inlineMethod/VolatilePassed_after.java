test;
[Test]
    class Foo {
    private volatile X volatileX;
  
    public void outer() {
        X localX = volatileX;
        assert localX == localX;
    }
  
  } 
  
