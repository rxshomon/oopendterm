package Users;

abstract class Person {
    private int id;
    private String fname;
    private String lname;

    public abstract int getId();

    public abstract void setId(int id);

    public abstract String getFname();

    public abstract void setFname(String fname);

    public abstract String getLname();

    public abstract void setLname(String lname);

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ",  fname=" + fname +
                ", lname=" + lname +
                '}';
    }
}

