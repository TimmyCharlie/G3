package bean;

public class GAC {
    private int geographicAreaID;
    private int code;
    private int level;
    private String name;
    private int alternativeCode;

    public int getGeographicAreaID() {
        return geographicAreaID;
    }

    public GAC(int geographicAreaID, int code, int level, String name, int alternativeCode) {
        this.geographicAreaID = geographicAreaID;
        this.code = code;
        this.level = level;
        this.name = name;
        this.alternativeCode = alternativeCode;
    }

    // Getters and Setters

    public void setGeographicAreaID(int geographicAreaID) {
        this.geographicAreaID = geographicAreaID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlternativeCode() {
        return alternativeCode;
    }

    public void setAlternativeCode(int alternativeCode) {
        this.alternativeCode = alternativeCode;
    }
}
