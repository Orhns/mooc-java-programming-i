
public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics(){
        int numberCount;
    }
    
    public void addNumber(int number){
        this.count = this.count + 1 ;
        this.sum = this.sum + number;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        int helper = 1;
        double avg;
        if (this.count==0) {
           avg  = this.sum*1.0 / helper;
        }else{
           avg = this.sum*1.0 / this.count;
        } 
        return avg;
    }
    
}
