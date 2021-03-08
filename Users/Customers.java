package Users;

public class Customers extends Person {
    private int id;
    private String fname;
    private String lname;
    private String telephone;
    private String address;

    public Customers(int id, String fname, String lname, String telephone, String address) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.telephone = telephone;
        this.address = address;
    }

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
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String newL = System.getProperty("line.separator");
        return newL + "Customers{" +
                "id: " + id + newL +
                "fname: " + fname + newL +
                "lname: " + lname + newL +
                "telephone: " + telephone + newL +
                "address: " + address + '}' + newL;
    }
}

