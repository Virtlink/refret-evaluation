test;
[pack1] {
[C]
    package pack1;
  
  public class C {
      static <A> POne<Hooray<A>> sequence(final Hooray<POne<A>> as) {
          return new POne<Hooray<A>>() {
              public Hooray<A> _1() {
                  return as.map(C.<A>__1());
              }
          };
      }
  
      static <A> Eff<POne<A>, A> __1() {
          return POne::_1;
      }
  }
[A]
    package pack1;
  
  interface Eff<A, B> {
      B f(A a);
  }
  
  abstract class POne<A> {
      abstract A _1();
  
  }
  
  final class Hooray<A> {
      public <B> Hooray<B> map(final Eff<A, B> f) {
          return null;
      }
  }
  
}
