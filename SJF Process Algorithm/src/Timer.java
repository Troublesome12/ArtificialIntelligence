import javax.sql.rowset.spi.SyncResolver;

/**
 * Created by Shariful Islam Arafat
 */

public class Timer extends Thread {
	
    private int time=0;
    public boolean running = true;

    public void run(){

        while(running){    
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time++;
        }
    }


    public void kill(){
            running=false;
    }

    public int getTime(){
            return time;
    }

    public void addTime(int time){
            this.time+=time;
    }
    
    public void deductTime(int time){
            this.time-=time;
    }
}