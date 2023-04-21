[[{move-class(F2,p1)}]]
test;
[p2] {
[F2]
    package p2;
  
  public class [[@F2|F2]] {}
}
[p1] {
[F1]
    package p1;
  
  class F1 {
    F2 f2;
  }
[F2]
    package [[@p1|p1]];
}
