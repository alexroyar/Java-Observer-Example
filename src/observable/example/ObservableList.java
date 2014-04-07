/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observable.example;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author alex
 */
public class ObservableList extends Observable {
    private ArrayList<String> messages;
    public ObservableList(){
        this.messages=new ArrayList<>();
    }
    
    public void add(String str){
        this.messages.add(str);
        setChanged();
        notifyObservers();
    }
}
