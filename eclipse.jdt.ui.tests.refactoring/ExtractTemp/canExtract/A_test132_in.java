test;
[A]
    package p; // 5, 16, 5, 28
  
  public class A {
  	int m(int[] arr, int index) {
  		return arr[++index] + arr[++index];
  	}
  }
