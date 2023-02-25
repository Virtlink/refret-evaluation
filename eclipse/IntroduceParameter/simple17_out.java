test;
[simple.out] {
[Catch1]
    //selection: 12, 13, 12, 15
  //name: fileNotFoundException -> first
  package simple.out;
  
  import java.io.FileNotFoundException;
  
  public class Catch1 {
  	public void foo(FileNotFoundException first) {
  		try {
  			throw new FileNotFoundException();
  		} catch (FileNotFoundException ex) {
  			first.printStackTrace();
  		}
  	}
  }
  
[Catch2]
    //selection: 16, 13, 16, 15
  //name: exception -> second
  package simple.out;
  
  import java.io.FileNotFoundException;
  import java.io.IOException;
  import java.io.InterruptedIOException;
  
  public class Catch2 {
  	public void foo(int a, IOException second) throws Exception {
  		try {
  			if (a < 10)
  				throw new FileNotFoundException();
  			else if (a < 20)
  				throw new InterruptedIOException();
  		} catch (FileNotFoundException | InterruptedIOException ex) {
  			second.printStackTrace();
  		}
  	}
  }
  
}
[simple] {
[NewInstance4]
    //selection: 12, 42, 12, 67
  //name: hashMap -> hashMap
  package simple;
  
  import java.util.Map;
  
  public class NewInstance4 {
  	class HashMap {
  	}
  
  	void foo(java.util.HashMap<String, Number> hashMap) {
  		Map<String, ? extends Number> m= hashMap;
  	}
  
  	public static void main(String[] args) {
  		new NewInstance4().foo(new java.util.HashMap<String, Number>());
  	}
  }
  
[NewInstance3]
    //selection: 11, 32, 11, 47
  //name: hashMap -> hashMap
  package simple;
  
  import java.util.Map;
  import java.util.HashMap;
  
  
  public class NewInstance3 {
  	Map<?, ?> test(HashMap<String, String> hashMap) {
  		Map<String, String> m= hashMap;
  		return m;
  	}
  
  	public static void test1(String[] args) {
  		new NewInstance3().test(new HashMap<String, String>());
  	}
  
  	public static Map<?, ?> test2(NewInstance3 a) {
  		Map<?, ?> bar= a.test(new HashMap<String, String>());
  		return bar;
  	}
  
  	int test3(int a) {
  		test(new HashMap<String, String>());
  		return a;
  	}
  }
  
[NewInstance2]
    //selection: 10, 32, 10, 47
  //name: hashMap -> hashMap
  package simple;
  
  import java.util.HashMap;
  import java.util.Map;
  
  class NewInstance2 {
  	void foo(HashMap<String, String> hashMap) {
  		Map<String, String> m= hashMap;
  	}
  
  	public static void main(String[] args) {
  		new NewInstance2().foo(new HashMap<String, String>());
  	}
  }
  
}
