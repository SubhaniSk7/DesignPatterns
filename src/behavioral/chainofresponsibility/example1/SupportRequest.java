package behavioral.chainofresponsibility.example1;

public class SupportRequest {
    private String level; // can be enum
    private String description;

    public SupportRequest(String level, String description) {
        this.level = level;
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
