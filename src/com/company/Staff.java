package com.company;

/**
 * @author ED
 */
public class Staff {
    /**
     * Имя
     */
    private String name;
    /**
     * ID
     */
    private String id;
    /**
     * Дата рождения
     */
    private String BirtDate;
    /**
     * Подразделение
     */
    private Subdivision st;
    /**
     * ЗП
     */
    private String salary;
    /**
     * Пол
     */
    private String gender;

    /**
     * @param name     - Имя
     * @param BirtDate _ День рождения
     * @param nameTwo  - Имя подразделения
     * @param salary   - зп
     * @param gender   - пол
     */
    public Staff(String name, String BirtDate, String nameTwo, String salary, String gender) {
        this.BirtDate = BirtDate;
        this.id = Subdivision.generation();
        this.name = name;
        this.salary = salary;
        st = new Subdivision(nameTwo);
        this.gender = gender;
    }

    /**
     * @param mas - ввод с поомщью строк
     */
    public Staff(String mas[]) {
        this.id = mas[0];
        this.name = mas[1];
        this.gender = mas[2];
        this.BirtDate = mas[3];
        this.st = new Subdivision(mas[4]);
        this.salary = mas[5];
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", BirtDate='" + BirtDate + '\'' +
                ", st=" + st.toString() +
                ", salary='" + salary + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
