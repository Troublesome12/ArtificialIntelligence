import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Shariful Islam Arafat
 */

public class Scheduler extends Thread{
    
    public static Calculator calculator = new Calculator();
    public static boolean processRunning=false;
    public static PriorityQueue<Process> processQueue = new PriorityQueue<Process>(10, new Comparator<Process>() {
        public int compare(Process process1, Process process2) {
            return (int)(process1.getArrivalTime()-process2.getArrivalTime());
        }
    });
	
    public static PriorityQueue<Process> readyQueue = new PriorityQueue<Process>(10, new Comparator<Process>() {
        public int compare(Process process1, Process process2) {
            return (int)(process1.getDuration()-process2.getDuration());
        }
    });
    
    public static Process runningProcess;
    
    public Scheduler(){
        populatingProcessQueue();
    }
    
    public void run(){
        while(true){
            if(checkIfNewProcessArrived()){
                while(!processQueue.isEmpty() && processQueue.element().getArrivalTime()<= SJF.timer.getTime()){
                    readyQueue.add(processQueue.poll());                   
                }                
            }
            
            if(!readyQueue.isEmpty() && processRunning){
                if(runningProcess.getDuration()>readyQueue.element().getDuration()){
                    doInterrupt();
                }
            }
            else if(!readyQueue.isEmpty() && !processRunning){
                runProcessInCpu();
            }
            else if(processQueue.isEmpty() && readyQueue.isEmpty() && !processRunning){
                SJF.timer.kill();
                calculate();
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private static void populatingProcessQueue() {
            /* id,arrivalTime,duration */
        processQueue.add(new Process(1,3,2));         
        processQueue.add(new Process(2,6,3));       
        processQueue.add(new Process(3,1,4));         
        processQueue.add(new Process(4,4,5));
    }
	
    public static boolean checkIfNewProcessArrived(){
        if(!processQueue.isEmpty()){
            if(processQueue.element().getArrivalTime()<=SJF.timer.getTime()){
                return true;   
            }
        }
        return false;
    }
	
    public static void runProcessInCpu() {       
        runningProcess = readyQueue.poll();
        processRunning=true;
        runningProcess.start();
//        calculator.completedList.add(process);
    }   
    
    public static void doInterrupt(){
        int currentTime = SJF.timer.getTime();
        runningProcess.stop();
        runningProcess.reduceDuration(currentTime-runningProcess.getStartingTime());
        if(runningProcess.getDuration()<=0)
            runningProcess.setFinishingTime(currentTime);
        else
            readyQueue.add(runningProcess);
        processRunning = false;
        runProcessInCpu();
    }

    private void calculate() {
//        System.out.println("Average Wating Time : " + calculator.getAWT());
//        System.out.println("Average Turn Around Time : " + calculator.getATT());
    }
}