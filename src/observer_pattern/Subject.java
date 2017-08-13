/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer_pattern;

/**
 *
 * @author Ali Othman
 */
public interface Subject {
           public void registerObserver(observer observer);

       public void removeObserver(observer observer);

       public void notifyObservers();
    
}
