test;
[AnonymousTest1]
    class AnonymousTest1 {
    interface Thing {
      boolean thing();
    }
  
    void dupeHolder() {
        duplicator(false);
    }
  
    void duplicator(final boolean thingReturn) {
      if (new Thing() {
        public boolean thing() {
          return thingReturn;
        }
      }.thing());
    }
  }
