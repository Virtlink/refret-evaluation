test;
[Test]
    class C<Y, X> {
  }
  
  class Usage extends C<Integer, String> {
    {
      C<String, Boolean> = new C();
    }
  }
