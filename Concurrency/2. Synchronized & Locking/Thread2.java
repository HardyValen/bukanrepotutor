public class Thread2 implements Runnable {

    private static int istatic = 0;
    private static Object object1 = new Object();
    private String s;

    public Thread2(String s) {
        this.s = s;
    }

    @Override
    public void run() {

        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(object1) { // lock istatic
                System.out.println(this.s + ": " + istatic);
                istatic++;
            }
        }
    }
}