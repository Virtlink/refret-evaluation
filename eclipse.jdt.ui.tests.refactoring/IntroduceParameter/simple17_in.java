test;
[simple] {
[Catch1]
    //selection: 12, 13, 12, 15
  //name: fileNotFoundException -> first
  package simple;
  
  import java.io.FileNotFoundException;
  
  public class Catch1 {
  	public void foo() {
  		try {
  			throw new FileNotFoundException();
  		} catch (FileNotFoundException ex) {
  			ex.printStackTrace();
  		}
  	}
  }
  
[Catch2]
    //selection: 16, 13, 16, 15
  //name: exception -> second
  package simple;
  
  import java.io.FileNotFoundException;
  import java.io.InterruptedIOException;
  
  public class Catch2 {
  	public void foo(int a) throws Exception {
  		try {
  			if (a < 10)
  				throw new FileNotFoundException();
  			else if (a < 20)
  				throw new InterruptedIOException();
  		} catch (FileNotFoundException | InterruptedIOException ex) {
  			ex.printStackTrace();
  		}
  	}
  }
  
[NewInstance4]
    //selection: 12, 42, 12, 67
  //name: hashMap -> hashMap
  package simple;
  
  import java.util.Map;
  
  public class NewInstance4 {
  	class HashMap {
  	}
  
  	void foo() {
  		Map<String, ? extends Number> m= new java.util.HashMap<>();
  	}
  
  	public static void main(String[] args) {
  		new NewInstance4().foo();
  	}
  }
  
[NewInstance3]
    //selection: 11, 32, 11, 47
  //name: hashMap -> hashMap
  package simple;
  
  import java.util.Map;
  import java.util.HashMap;
  
  
  public class NewInstance3 {
  	Map<?, ?> test() {
  		Map<String, String> m= new HashMap<>();
  		return m;
  	}
  
  	public static void test1(String[] args) {
  		new NewInstance3().test();
  	}
  
  	public static Map<?, ?> test2(NewInstance3 a) {
  		Map<?, ?> bar= a.test();
  		return bar;
  	}
  
  	int test3(int a) {
  		test();
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
  	void foo() {
  		Map<String, String> m= new HashMap<>();
  	}
  
  	public static void main(String[] args) {
  		new NewInstance2().foo();
  	}
  }
  
}
