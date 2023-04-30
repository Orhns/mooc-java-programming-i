/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarunas
 */
public class Person {
    private String name;
    private int age;
    private String surname;
    private int weight;
    private int height;
    
    public Person(String initialName){
        
        this.name = initialName;
        this.height = 0;
        this.weight = 0;
        this.age = 0;
    }
    public void yasEkle(int yas){
    this.age = yas;
    }
    public void soyAd(String soyadi){
    this.surname = soyadi;
    }
    public void printPerson(){
        System.out.println(this.name + " " +", age " + this.age + " yaşında");
    }
    public void growOlder(){
            this.age = this.age + 1 ;
    }
    public boolean isOfLegalAge(){
        if (this.age < 18) {
            return false;
        }
        return true;
    }
    public String getName(){
        return this.name;
    }
    public void setHeight(int newHeight){
        this.height = newHeight;
    }
    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    public double bodyMassIndex(){
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
 
}
