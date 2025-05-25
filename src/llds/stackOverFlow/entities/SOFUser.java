package llds.stackOverFlow.entities;

public class SOFUser {
    public static int userCount = 0;
    private int id;
    private String name;
    private int reputation;

    SOFUser(String name){
        this.name = name;
        userCount++;
        this.id = userCount;
    }

    public void addReputation(int value){
        this.reputation += value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getReputation() {
        return reputation;
    }
}
