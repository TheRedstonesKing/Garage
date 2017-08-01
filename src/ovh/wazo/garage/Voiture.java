package ovh.wazo.garage;

/**
 * <br>
 * Author : <a href="https://git-01.dev.uhcwork.net/u/Rapace">Wazo</a><br>
 * Project hello_world
 * <br>
 */
public class Voiture {


    private String brand;
    private String color;

    private Person proprio;

    public Voiture(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public boolean hasProprio(){
        return proprio != null;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProprio(Person proprio) {
        this.proprio = proprio;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Person getProprio() {
        return proprio;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
