public class StackEmptyException extends Exception {
  public StackEmptyException() {}

  public String getMessage() {
    return ("Error: Stack Was Empty!");
  }
}