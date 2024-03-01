
//• category es la categoría del producto. Puede tener los valores enteros del 0 al 9.
//• aisle es el número de pasillo donde se guarda el producto, se representa con un
//número entero de 3 posiciones.
//• bin dentro de los pasillos hay diferentes "bin"s que indican el lugar exacto donde se
//guarda el producto, se representa con un número entero de 3 posiciones.
public class Producto {

    String nombre, category;
    int id, aisle, bin;
    float price;

    public Producto() {
    }

    public Producto(String nombre, String category, int id, int aisle, int bin, float price) {
        this.nombre = nombre;
        this.category = category;
        this.id = id;
        this.aisle = aisle;
        this.bin = bin;
        this.price = price;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //id,name,category,price,aisle,bin
    @Override
    public String toString() {
        return id + "," + nombre + "," + category + "," + price + "," + aisle + "," + bin;
    }
}
