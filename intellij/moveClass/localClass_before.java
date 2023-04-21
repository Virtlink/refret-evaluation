[[{move-class(1, pack2)}]]
test;
[pack1] {
[A]
    package pack1;
  
  public class [[@1|A]] {
      public void method () {
          class X {
          }
          X x = new X();
      }
  }
}
[pack2] {
[A]
    package [[@pack2|pack2]];
}
