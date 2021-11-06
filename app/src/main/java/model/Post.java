package model;

public class Post {

    private String postName;
    private String dateStart;
    private String dateEnd;
    private String location;
    private String businessName;
    private String UriImage;
//TODO poner coordenadas y hacer guetter
    public Post(String postName, String dateStart, String dateEnd, String location) {
        this.postName = postName;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.location = location;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getUriImage() {
        return UriImage;
    }

    public void setUriImage(String uriImage) {
        UriImage = uriImage;
    }
}
