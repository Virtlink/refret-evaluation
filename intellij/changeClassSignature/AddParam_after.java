test;
[Test]
    class L<E> {}
  class <caret>C<T, E> {
  }
  
  class Usage extends C<String, L<String>> {
    {
      C<? extends Integer, L<? extends Integer>> c = new C<Integer, L<Integer>>();
    }
  }
