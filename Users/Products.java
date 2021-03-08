package Users;

public class Products {
    private int id;
    private String name;
    private int price;
    private String size;
    private String material;
    private String category;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        String newL = System.getProperty("line.separator");
        return newL + "Products{" +
                "id: " + id + newL +
                "name: " + name  + newL +
                "cost: " + price + newL +
                "size: " + size + newL +
                "material: " + material + newL +
                "category: " + category  + '}' + newL;
    }
}
