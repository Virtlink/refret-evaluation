test;
[Client]
    class Client {
      void method() {
          <selection>new PairProvider<String, Integer, Boolean>().getPair()</selection>
      }
  }
[Pair]
    class Pair<L,R> {
      public Pair(L l, R r) {
      }
      public L getL() {
          return null;
      }
      public R getR() {
          return null;
      }
  }
[PairProvider]
    class PairProvider <U, V, W>{
      public Pair<U, Pair<V, W>> getPair() {
          return null;
      }
  }
