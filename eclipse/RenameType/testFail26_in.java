test;
[p2] {
[B]
    package p2;
  public interface B{}
}
[p1] {
[A]
    package p1;
  import p2.B;
  public class A{} 
}
