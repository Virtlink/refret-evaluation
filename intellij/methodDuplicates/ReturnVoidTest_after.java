test;
[Test]
    class ReturnVoidTest {
    interface Thing {
      boolean thing();
    }
  
    void dupeHolder() {
        duplicator(false);
    }
  
    void duplicator(final boolean thingReturn) {
      if (thingReturn ) return;
    }
  }
