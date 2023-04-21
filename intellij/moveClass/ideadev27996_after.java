test;
[pack1] {
[X]
  package pack1;
  
  class Y {}
}
[pack2] {
[X]
  package [[@pack2|pack2]];

  public class X {
      public void foo(X x) {}
  }
}