test;
[Super]
    interface Int<T> {
  }
  
[Test]
    abstract class Test implements Runnable {
    <T extends Runnable> void m() {
    }
  }
