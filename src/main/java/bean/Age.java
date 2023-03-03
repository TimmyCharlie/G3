package bean;

public class Age {
    private int ageID, ageGroup, censusYear, geographicArea, combined, male, female;

    public Age(int ageID, int ageGroup, int censusYear, int geographicArea, int combined, int male, int female) {
        this.ageID = ageID;
        this.ageGroup = ageGroup;
        this.censusYear = censusYear;
        this.geographicArea = geographicArea;
        this.combined = combined;
        this.male = male;
        this.female = female;
    }

    public int getAgeID() {
        return ageID;
    }

    public void setAgeID(int ageID) {
        this.ageID = ageID;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getCensusYear() {
        return censusYear;
    }

    public void setCensusYear(int censusYear) {
        this.censusYear = censusYear;
    }

    public int getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(int geographicArea) {
        this.geographicArea = geographicArea;
    }

    public int getCombined() {
        return combined;
    }

    public void setCombined(int combined) {
        this.combined = combined;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }
}