test;
[Varargs]
    import java.util.*;
  
  public class Varargs {
  	private List<String> method(String... values) {
  		return Arrays.asList(values);
  	}
  	private void context() {
  		List<String> list1 = method("hi", "bye");
  		List<String> list2 = method("hi");
  		List<String> list3 = method(new String[] {});
  		String[] sa = new String[] {};
  		List<String> list4 = method(sa);
  
  		List listA = Arrays.asList(0);
  	}
  }
  
