/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarunas
 */
public class Fitbyte {
    private int age;
    private int resting;
    public Fitbyte(int age, int restingBeat){
        this.age = age;
        this.resting = restingBeat;
    }
    public double targetHeartRate(double percentageOfMaximum){
        double maxHR = 206.3 - (0.711 * this.age);
        double targetHR = ((maxHR - this.resting) * (percentageOfMaximum) + this.resting);
        return targetHR;
    }
}
