//tablodan gelecek her bir veri 1 sehir oldugu icin onlaraın hepsine ayrı bir class olusturuyorum.

public class City {

    private int ıd;
    private String name;
    private String countrycode;
    private String district;
    private int population;

    public City(int ıd, String name, String countrycode, String district, int population) {
        this.ıd = ıd;
        this.name = name;
        this.countrycode = countrycode;
        this.district = district;
        this.population = population;
    }

    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
