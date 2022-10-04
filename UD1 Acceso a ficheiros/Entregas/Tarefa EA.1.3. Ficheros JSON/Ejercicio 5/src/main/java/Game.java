import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.util.ArrayList;

@JsonRootName(value = "game")

public class Game implements Serializable {
    private String name;
    private String description;
    private ArrayList<String> languages;

    public Game() {
    }

    public Game(String name, String description, ArrayList<String> languages) {
        this.name = name;
        this.description = description;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }
}
