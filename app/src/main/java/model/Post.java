package model;

public class Post {

    private String postName;
    private String dateStart;
    private String dateEnd;
    private String location;
    private String businessName;

    public Post(String postName, String dateStart, String dateEnd, String location) {
        this.postName = postName;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.location = location;
    }


}
