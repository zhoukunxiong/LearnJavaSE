public class Cat {
    private String color;
    private String breed;

    public Cat() {
    }

    public Cat(String color, String breed) {
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
        return "Cat{color = " + color + ", breed = " + breed + "}";
    }

    void eat() {
        System.out.println("吃鱼.....");
    }

    void catchMouse() {
        System.out.println("逮老鼠.....");
    }
}
