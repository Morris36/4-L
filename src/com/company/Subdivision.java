package com.company;

/**
 * @author ED
 */
class Subdivision {
    private String id;
    private String name;

    @Override
    public String toString() {
        return "Subdivision{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Subdivision(String name) {
        this.name = name;
        this.id = generation();
    }

    /**
     * @return Случайное число
     */
    protected static String generation() {
        return Integer.toString((int) (Math.random() * 100000));
    }
}
