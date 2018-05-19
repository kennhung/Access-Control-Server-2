package indi.kennhuang.accesscontrol.server.db.instance;

import io.jsondb.annotation.Document;
import io.jsondb.annotation.Id;
import io.jsondb.annotation.Secret;

/**
 * A test Pojo representing a imaginary class Instance.
 * @version 1.0 28-Sep-2016
 */
@Document(collection = "users", schemaVersion= "1.0")
public class UserInstance {
    //This field will be used as a primary key, every POJO should have one
    @Id
    private String uid;

    private String username;
    private String groups;
    private String doors;

    public String getUId() { return uid; }
    public void setUId(String uid) { this.uid = uid; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getGroups() { return groups; }
    public void setGroups(String groups) { this.groups = groups; }
    public String getDoors() { return doors; }
    public void setDoors(String doors) { this.doors = doors; }
}