import java.util.ArrayList;

/**
 * Created by Shariful Islam Arafat
 */

public class Calculator {
    
    public ArrayList<Process> completedList = new ArrayList<Process>(10);
    
    //calculate Average Waiting Time
    public double getAWT(){
        int waitingTime=0;
        for(int i=0;i<completedList.size();i++){
            Process process = completedList.get(i);
            waitingTime+=process.getStartingTime()-process.getArrivalTime();
        }
        double averageWaitingTime = waitingTime*1.0/completedList.size();
        return averageWaitingTime;
    }
     
    //calculate Average Turn Around Time
    public double getATT(){
        int turnAroundTime=0;
        for(int i=0;i<completedList.size();i++){
            Process process = completedList.get(i);
            turnAroundTime+=process.getFinishingTime()-process.getArrivalTime();
        }
        double averageTurnAroundTime = turnAroundTime*1.0/completedList.size();
        return averageTurnAroundTime;
    }
}