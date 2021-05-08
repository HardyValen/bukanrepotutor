import java.util.ArrayList;

public class Stack<T extends Displayable> {

  private ArrayList<T> item = new ArrayList<>();
  private Integer count = 0;
  private Integer maxCount = 10;

  public void setMaxCount(Integer maxCount) {
    this.maxCount = maxCount;
    // Kalo negatif bikin if sendiri, mager.
  }

  public void push(T item) throws StackOverflowException {
    if (this.count + 1 <= this.maxCount) {
      this.count++;
      this.item.add(item);
    } else {
      throw new StackOverflowException();
    }
  }

  public T pop() throws StackEmptyException {
    if (this.count > 0) {
      this.count--;

      T item = this.item.get(this.count);
      this.item.remove((int) this.count);

      return item;
    } else {
      throw new StackEmptyException();
    }
  }

  public void displayTop() throws StackEmptyException {
    if (this.count > 0) {
      this.item.get(this.count - 1).display();
    } else {
      throw new StackEmptyException();
    }
  }

  @Override
  public String toString() {
    return "Stack count: " + this.count + "; Stack max count: " + this.maxCount + "\n"; 
  }
}
