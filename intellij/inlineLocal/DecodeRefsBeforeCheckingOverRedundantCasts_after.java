test;
[Test]
    class Outer {
  
    public void bar() {
  
        new Object() {
        public void run() {
          Outer.this.baz();
        }
      };
    }
  
    public void baz() {
    }
  }
