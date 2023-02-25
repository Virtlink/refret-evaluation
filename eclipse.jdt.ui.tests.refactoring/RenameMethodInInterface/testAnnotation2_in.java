test;
[p] {
[A]
    package p;
  
  @I(thing="Description")
  @interface I {
      String thing(); // rename to "value"
  }
}
