test;
[pack2] {
[Class1]
    package pack2;

  import [[->2|Class2|pack1.Class2]];

  public class Class1 {
    [[->2|Class2]] a;
  }
}
[pack1] {
[Class2]
    package pack1;

  public class [[2|Class2]] {
  }
}
