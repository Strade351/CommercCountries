/**
 * Класс Страны, который описывает название, население и процент от мирового населения
 */
public class Country {
    /**
     * countryName (поле) - название страны
     */
    private String countryName;
    /**
     * peopleCount (поле) - население страны
     */
    private int peopleCount;
    /**
     * percent (поле) - процент от мирового населения
     */
    private double percent;
    /**
     * continent (поле) - поле перечисления континентов(enum)
     */
    private Continents continent;
    /**
     * WORLD_POPULATION (статическое поле) - население земли
     */
    public static final int WORLD_POPULATION = 7000; //7000 миллионов


    /**
     * Конструктор класса Country(процент считается автоматически)
     * @param countryName - название страны
     * @param peopleCount - население страны
     *
     */
    public Country(String countryName, int peopleCount) {
        this.countryName = countryName;
        this.peopleCount = peopleCount;
        this.percent = Math.round((peopleCount)/WORLD_POPULATION)/1000d;
    }

    /**
     * Метод toString
     * @return выводит в текстовом формате содержимое объекта класса
     */
    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleCount=" + peopleCount +
                ", percent=" + percent +
                '}';
    }

    /**
     * Геттер для получения названия страны
     * @return Название страны
     */
    public String getCountryName() {
        return countryName;
    }
    /**
     * Геттер для получения населения страны
     * @return Население страны
     */
    public int getPeopleCount() {
        return peopleCount;
    }
    /**
     * Геттер для получения процента населения страны от мирового
     * @return Процент
     */

    public double getPercent() {
        return percent;
    }

    /**
     * Геттер для получения континента
     * @return континент
     */
    public Continents getContinent() {
        return continent;
    }

    /**
     * Сеттер для установки континента
     * @param continent
     */
    public void setContinent(Continents continent) {
        this.continent = continent;
    }
}
