test;
[Super]
    interface Int<T> {
  }
  abstract class Super implements Runnable {
  }
  
[Test]
    abstract class Test extends Super {
    <T extends Super> void m() {
    }
  }
