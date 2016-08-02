/**
 * Created by Shariful Islam Arafat
 */

public class Process extends Thread{
    private int id;
    private int arrivalTime;
    private int duration;
    private int startingTime=-1;
    private int finishingTime;

    public Process(){

    }

    public Process(int id, int arrivalTime, int duration){
        this.id=id;
        this.arrivalTime=arrivalTime;
        this.duration=duration;
    }

    public void run() {
        if(startingTime<0)
            startingTime=SJF.timer.getTime();
        
        System.out.println("Process Id: "+id + " || Time: "+SJF.timer.getTime());
        int estimatedTime = SJF.timer.getTime() + duration;
        while(SJF.timer.getTime()<estimatedTime){
            yield();
        }
        if(SJF.timer.getTime()==estimatedTime)
            duration=0;
        if(duration==0)
            finishingTime=SJF.timer.getTime();
//        System.out.println("Process Id: "+id + " completed || Time: "+finishingTime);
        Scheduler.processRunning=false;
        SJF.timer.deductTime(1);
    }
    

    public long getId(){
        return id;
    }

    public int getArrivalTime(){
        return arrivalTime;
    }

    public int getDuration(){
        return duration;
    }
    
    public int getStartingTime(){
        return startingTime;
    }
    
    public int getFinishingTime(){
        return finishingTime;
    }
    
    public void reduceDuration(int time){
        duration-=time;
    }
    
    public void setFinishingTime(int time){
        finishingTime=time;
    }
}