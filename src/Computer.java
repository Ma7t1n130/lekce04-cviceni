import java.math.BigDecimal;

public class Computer implements Comparable<Computer>{
    private String description;
    private int yearOfProduction;
    private BigDecimal price;



    public Computer(String description, int yearOfProduction, BigDecimal price) {
        this.description = description;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "description='" + description + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Computer otherComputer) {
        //vychozí způsob řazení
        //vrací záporné číslo, nulu nebo kladné číslo, pokud je objekt menší, roven nebo větší než druhý objekt
        //záporné číslo pokud tento je před otherComputer
        //nulu pokud jsou si rovni
        //kladne cislo pokud tento pocitac je po otherComputer
        //return 0;
        return this.description.compareTo(otherComputer.description);
    }
}
