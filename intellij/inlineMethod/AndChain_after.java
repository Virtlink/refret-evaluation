test;
[MyQueue]
    import java.util.NoSuchElementException;

  public class MyQueue {
    private long[] [[@1|items]] = new long[16];

    private int [[@3|head]];
    private int tail;

    public boolean [[@2|isEmpty]]() { return head == tail; }

      // true if the first element of the queue is greater than specified number
    public boolean firstIsGreaterThan(int x) {
        if (isEmpty()) return false;
        if ([[->2|isEmpty()]])
          throw new NoSuchElementException("Queue is empty");
        return [[->1|items]][ [[->3|head]] ] > x;
    }

    // other methods
  }
