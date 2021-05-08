public class Thread2 implements Runnable {

    private String s;

    public Thread2(String s) {
        this.s = s;
    }

    @Override
    public void run() {

        for(int i = 0; i < 5; i++) {
            System.out.println(this.s + ": " + i);
        }
    }
}