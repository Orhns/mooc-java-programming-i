/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarunas
 */
class Games {
    private String hTeam;
    private String vTeam;
    private int hScore;
    private int vScore;
    
    public Games(String hT, String vT, int hS, int vS ){
        this.hTeam = hT;
        this.vTeam = vT;
        this.hScore = hS;
        this.vScore = vS;
    }
    public int hScore(){
        return this.hScore;
    }
    public int vScore(){
        return this.vScore;
    } 
    public String hTeam(){
        return this.hTeam;
    }
    public String vTeam(){
        return this.vTeam;
    }
    public String toStr(){
    return (hTeam+vTeam+hScore+vScore); 
    }
}
