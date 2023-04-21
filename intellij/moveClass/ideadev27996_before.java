[[{move-class(1, pack2)}]]
test;
[pack1] {
[X]
  package pack1;
  
  public class [[@1|X]] {
      public void foo(X x) {}
  }
  class Y {}
}
[pack2] {
[X]
  package [[@pack2|pack2]];
}