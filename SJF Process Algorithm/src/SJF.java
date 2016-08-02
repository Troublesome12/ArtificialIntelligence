
/**
 * Created by Shariful Islam Arafat
 */

public class SJF {
	
    public static Timer timer;
    public static Scheduler scheduler;
	
    public static void main(String[] args) {
        timer = new Timer();
        scheduler = new Scheduler();
        timer.start();
        scheduler.start();
    }
}