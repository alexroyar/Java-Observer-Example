/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observable.example;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public final class ObservableExample implements Observer{

    ObservableList list = null;
    Scanner sc = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ObservableExample().run();
    }
    
    public ObservableExample(){
        this.list = new ObservableList();
        this.list.addObserver(this);
        this.sc = new Scanner(System.in);
        run();

    }
    
    public void run(){
        String str = "";
        while(!str.equalsIgnoreCase("exit")){
            System.out.println("Add some String to list:");
            str = this.sc.nextLine();
            this.list.add(str);
        }
        
    }
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Change detected");
    }
    
}
