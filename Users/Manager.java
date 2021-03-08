package Users;

public class Manager extends Person {
    private int id;
    private String fname;
    private String lname;

    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getFname() {
        return fname;
    }

    @Override
    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String getLname() {
        return lname;
    }

    @Override
    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        String newL = System.getProperty("line.separator");
        return "Manager{" +
                "id: " + id + newL +
                "Name: " + fname + newL +
                "Surname " + lname + newL +
                '}';
    }
}

