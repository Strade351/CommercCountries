public class Country {

    private String countryName;
    private int peopleCount;
    private double percent;

    public Country(String countryName, int peopleCount, double percent) {
        this.countryName = countryName;
        this.peopleCount = peopleCount;
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleCount=" + peopleCount +
                ", percent=" + percent +
                '}';
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public double getPercent() {
        return percent;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
