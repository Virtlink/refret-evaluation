test;
[Super]
    interface Super<T> extends Int<T> {
  }
  interface Int<T> {
  }
  
[Test]
    interface Test<T> extends Super<T>{
  }
  
