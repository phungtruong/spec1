package phungtruong.com.spec1.model;

/**
 * Created by MR PHUNG on 3/16/2017.
 */

public class Team {
    String id;
    String name;

    public Team(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
