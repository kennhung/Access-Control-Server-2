package indi.kennhuang.accesscontrol.server.db.instance;

import io.jsondb.annotation.Document;
import io.jsondb.annotation.Id;

/**
 * A test Pojo representing a imaginary class Instance.
 * @version 1.0 28-Sep-2016
 */
@Document(collection = "group", schemaVersion= "1.0")
public class GroupInstance {
    //This field will be used as a primary key, every POJO should have one
    @Id
    private String id;

    private String name;
    private String doors;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDoors() { return doors; }
    public void setDoors(String doors) { this.doors = doors; }
}