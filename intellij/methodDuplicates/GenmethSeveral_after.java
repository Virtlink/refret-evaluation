test;
[Genmeth]
    import java.util.AbstractList;
  import java.util.ArrayList;
  import java.util.List;
  
  public class Genmeth {
  	public void context() {
  		Integer v1 = 0;
  		AbstractList<String> v2 = new ArrayList<String>(0);
  		int res = method(v1, v2);
  	}
  
  	public <T, U extends List> int <caret>method(T t, U u) {
  		return t.hashCode() + u.size();
  	}
  }
  
