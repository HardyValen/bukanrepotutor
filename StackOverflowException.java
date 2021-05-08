public class StackOverflowException extends Exception {
  public StackOverflowException() {}

  public String getMessage() {
    return ("Error: Stack Overflow!");
  }
}