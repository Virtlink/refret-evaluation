test;
[TypesExtendsReturnDifferentReference]
    class Types {
  	public static String referenceMethod(Object o) {
  		return o.toString();
  	}
  	public static void referenceContext(Object o) {
  		String s = referenceMethod(o.getClass());
  		Object v = referenceMethod(o);
  	}
  }
  
