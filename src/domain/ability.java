package domain;

public class ability {
    private String name;
    private String description;
    private String type;

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

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
