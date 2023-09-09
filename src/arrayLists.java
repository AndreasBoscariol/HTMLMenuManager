package menugenerator;

import java.io.Serializable;
import java.util.ArrayList;

public class arrayLists implements Serializable {
    public ArrayList<foodItem> menu = new ArrayList<>();
    public ArrayList<String> category = new ArrayList<>();
    public ArrayList<String> display = new ArrayList<>();
    
    public arrayLists(ArrayList<foodItem> menu,  ArrayList<String> category , ArrayList<String> display){
        this.menu = menu;
        this.category = category;
        this.display = display;
    }
    public  ArrayList<foodItem> getMenu(){
        return menu;
    }
    public ArrayList<String> getCat(){
        return category;
    }
    public ArrayList<String> getDisplay(){
        return display;
    }
}
