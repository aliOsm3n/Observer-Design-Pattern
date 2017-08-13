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
public class Observer_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // this will maintain all loans information
        
        Newspaper printMedia  = new Newspaper();
        Internet  onlineMedia  =new  Internet();
        
        Loan personalLoan =new Loan("Personal Loan", 12.5f, "Standard Charterd");
        
        personalLoan.registerObserver(printMedia);
        personalLoan.registerObserver(onlineMedia);
         
        personalLoan.setInterest(3.5f);
    
    }
        
    
}





//Example is very Simple you have a Loan on which interest rate is subject to change and when it changes,
//Loan notifies to Newspaper or Internet media to display new loan interest rate. 
//To implement this we have a Subject interface which contains methods for adding,
//removing and notifying Observers and an Observer interface which contains update(int interest) method 
//        which will be called by Subject implementation when interest rate changes.
//محصلة لزيادة سعر الفائدة على القرض
// بالتالى انا بدفع القرض على فترات وبالتالى سعر الفلوس بيقل فلازم يجيبلى اشعارات عن السعر اللى باقى 




