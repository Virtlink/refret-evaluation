test;
[Test]
    class AnonymousTest {
    interface Thing {
      boolean thing();
    }
  
    void dupeHolder() {
      Thing thing = duplicator(false);
    }
  
    Thing duplicator(final boolean thingReturn) {
      return new Thing() {
        public boolean thing() {
          return thingReturn;
        }
      };
    }
  }
