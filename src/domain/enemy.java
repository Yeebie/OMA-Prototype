package domain;

public class enemy {
    private String name;
    private String type;
    private String[] typeArray;
    private String classification;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(int type) {
        this.type = typeArray[type];
    }

    public String getType() {
        return type;
    }

    public void setTypeArray(String[] typeArray) {
        this.typeArray = typeArray;
    }

    public String[] getTypeArray() {
        return typeArray;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }
}
