test;
[p0] {
[Test]
    package p0;
  
  import p1.Other;
  
  public class Test {
  	void m() {
  		Other.bar(new StringBuffer("hello"), 1, 3);
  		Other.bar(new StringBuffer("hello"), 1, 4);
  	}
  }
  
}
[p1] {
[Other]
    package p1;
  public class Other {
  
  	/**
  	 * @param stringBuffer
  	 * @param arg0
  	 * @param arg1
  	 * @return
  	 */
  	public static String bar(StringBuffer stringBuffer, int arg0, int arg1) {
  		return stringBuffer.substring(arg0, arg1);
  	}
			
  }
  
}
