test;
[Test]
    class C<T> {
  }
  
  class Usage extends C<String> {
    {
      C<String> c = new C<String>();
  
      C<String> c = new C<String>() { }
    }
  }
