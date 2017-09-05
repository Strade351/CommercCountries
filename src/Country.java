public class Country {
    String countryName;
    int peopleCount;
    double percent;

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
}
