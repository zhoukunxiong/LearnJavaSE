public class Movie {
    /*需求：
    1.展示系统中全部电影（名称和评分）
    2.允许用户根据电影编号（id）查询出某个电影的详细信息
     */
    private int id;
    private String title;
    private String time;
    private double score;
    private String area;
    private String type;
    private String director;
    private String starring;


    public Movie() {
    }

    public Movie(int id, String title, String time, double score, String area, String type, String director, String starring) {
        this.id = id;
        this.title = title;
        this.time = time;
        this.score = score;
        this.area = area;
        this.type = type;
        this.director = director;
        this.starring = starring;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     *
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置
     *
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取
     *
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     *
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * 获取
     *
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     *
     * @return director
     */
    public String getDirector() {
        return director;
    }

    /**
     * 设置
     *
     * @param director
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * 获取
     *
     * @return starring
     */
    public String getStarring() {
        return starring;
    }

    /**
     * 设置
     *
     * @param starring
     */
    public void setStarring(String starring) {
        this.starring = starring;
    }

    public String toString() {
        return "Movie{id = " + id + ", title = " + title + ", time = " + time + ", score = " + score + ", area = " + area + ", type = " + type + ", director = " + director + ", starring = " + starring + "}";
    }

    public void show() {
        System.out.println("title:" + this.title);
        System.out.println("score:" + this.score);
        System.out.println("-----------------------------");
    }

    public void showAll() {
        System.out.println("ID:" + this.id);
        System.out.println("title:" + this.title);
        System.out.println("time:" + this.time);
        System.out.println("score:" + this.score);
        System.out.println("area:" + this.area);
        System.out.println("type:" + this.type);
        System.out.println("director:" + this.director);
        System.out.println("starring:" + this.starring);
        System.out.println("------------------------------");
    }
}
