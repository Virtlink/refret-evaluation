test;
[Test]
    class Types {
  	public int primitiveMethod(boolean b) {
  		return b ? 1 : 0;
  	}
  	public void primitiveContext(boolean b) {
  		int i = primitiveMethod(!b);
  		long l = primitiveMethod(b);
  	}
  }
  
