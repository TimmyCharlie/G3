package bean;

public class AgeGroup {
    private int ageGroupID;
    private String description;

    public AgeGroup(int ageGroupID, String description) {
        this.ageGroupID = ageGroupID;
        this.description = description;
    }

    // Getters and Setters

    public int getAgeGroupID() {
        return ageGroupID;
    }

    public void setAgeGroupID(int ageGroupID) {
        this.ageGroupID = ageGroupID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
