public class Dog {
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     *
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置
     *
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return "Dog{color = " + color + ", breed = " + breed + "}";
    }

    void eat() {
        System.out.println("啃骨头.....");
    }

    void lookHome() {
        System.out.println("看家.....");
    }
}
