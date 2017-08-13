/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer_pattern;

import java.util.ArrayList;

/**
 *
 * @author Ali Othman
 */
public class Loan implements Subject{
    private  ArrayList <observer> observers =new ArrayList<observer>();
    private String type;
    private float interest;
    private String bank;

    public String getType() {
        return type;
    }

    public float getInterest() {
        return interest;
    }

    public String getBank() {
        return bank;
    }

    public void setInterest(float interest) {
        this.interest = interest;
        notifyObservers();
    }
    
    public Loan(String type , float interst ,String bank){
        this.type=type;
        this.interest=interst;
        this.bank=bank;
    }

    @Override
    public void registerObserver(observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(observer ob :observers){
            System.out.println("Notifying Observers on change in Loan interest rate");
            ob.update(interest);
        }
    }
    
    
}
