/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarunas
 */
public class mainClk {
    public static void main(String[] args) {
        ClockHand hours = new ClockHand(24);
        ClockHand minutes = new ClockHand(60);
        ClockHand seconds = new ClockHand(60);
        
        while(true){
            System.out.println( hours + ":" + minutes + ":" + seconds);
            
            seconds.advance();
            
            if (seconds.value() == 0) {
                minutes.advance();
                
                if (minutes.value() == 0) {
                    hours.advance();
                }
            }
        }
        
    }
}
