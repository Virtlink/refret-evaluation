test;
[Genmeth]
    import java.util.AbstractList;
  import java.util.ArrayList;
  import java.util.List;
  
  public class Genmeth {
  	public void context() {
  		Integer v1 = 0;
  		int v1a = v1.hashCode();
  		AbstractList<String> v2 = new ArrayList<String>(0);
  		int v2a = method(v2);
  		AbstractList<Double> v3 = new ArrayList<Double>(0);
  		int v3a = method(v3);
  		AbstractList<Integer> v4 = new ArrayList<Integer>(0);
  		int v4a = method(v4);
  	}
  
  	public <T extends List> int method(T t) {
  		return t.hashCode();
  	}
  }
  
