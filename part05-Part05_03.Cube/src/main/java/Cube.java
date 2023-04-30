/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarunas
 */
public class Cube {
    private int edge;
    
    public Cube(int edgeLenght){
        this.edge = edgeLenght;
    }
    public int volume(){
        int volume = this.edge*this.edge*this.edge;
        return volume;
    }
    public String toString(){
     return this.volume() + ("\nThe length of the edge is " + this.edge + " and the volume " + this.volume());
    }
}
