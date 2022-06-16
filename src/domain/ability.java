package domain;

import java.util.ArrayList;

public class ability {
    private String name;
    private String description;
    private ArrayList<String> type = new ArrayList<String>();

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setType(ArrayList<String> type){
        this.type = type;
    }

    public ArrayList<String> getType(){
        return type;
    }
}
