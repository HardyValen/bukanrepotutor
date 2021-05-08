public class Thread1 extends Thread {

    private String s;
    
    public Thread1(String s) {
        this.s = s;
    }

    @Override
    public void run() {

        for(int i = 0; i < 5; i++) {
            System.out.println(this.s + ": " + i);
        }
    }
}