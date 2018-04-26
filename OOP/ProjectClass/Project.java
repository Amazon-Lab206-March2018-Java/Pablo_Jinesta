import java.util.*;

// Create a Project class that has the fields of name and description.

public class Project {
    private String name;
    private String description;

    // Overload the constructor method in three different ways:

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Create getter and setters for each field

    // Name getter  
    public String getName() {
        return name;
    }

    // Name setter
    public void setName(String name) {
        this.name = name;
    }

    // Description getter  
    public String getDescription() {
        return description;
    }

    // Description setter
    public void setDescription(String description) {
        this.description = description;
    }

    // Create an instance method called elevatorPitch that will return the name and description separated by a colon.
    public String elevatorPitch() {
        return name + " : " + description;
    }
}