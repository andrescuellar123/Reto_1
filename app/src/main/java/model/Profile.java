package model;

public class Profile {

    private String businessName;
    private String description;
    private String imageUri;

    public Profile(String businessName, String description, String imageUri) {
        this.businessName = businessName;
        this.description = description;
        this.imageUri = imageUri;
    }

    public Profile() {
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUri() {
        return imageUri;
    }
}
