test;
[TypesExtendsReturnDifferentArray]
    class Types {
  	public static String[] arrayMethod(String s) {
  		return new String[] {s};
  	}
  	public static void arrayContext(String s) {
  		String[] sa = arrayMethod(s.substring(0));
  		Object[] oa = arrayMethod(s);
  	}
  }
  
