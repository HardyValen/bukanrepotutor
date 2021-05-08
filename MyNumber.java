public class MyNumber implements Displayable {
  public int n;
    
  public MyNumber(int n) {
    this.n = n;
  }

  public void display() {
    System.out.println("Inside MyNumber::display() method.");
  }
}
