package menugenerator;

import java.io.Serializable;

public class foodItem implements Serializable {
    public String name="";
    public String price="";
    public String desc="";
    public String cat="";
    public String url="";
    
    public foodItem(String name, String price, String desc, String cat, String url){
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.cat = cat;
        this.url = url;
    }
    public String getName(){
        return name;
    }
    public String getPrice(){
        return price;
    }
    public String getDesc(){
        return desc;
    }
    public String getCat(){
        return cat;
    }
    public void setCat(String cat){
        this.cat=cat;
    }
    public String getUrl(){
        return url;
    }
}
