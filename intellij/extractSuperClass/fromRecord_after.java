test;
[p] {
[IA]
    package p;
  public record IA(int m) implements A {}
[A]
    package p;
  
  public interface A {
      int m();
  }
  
}
