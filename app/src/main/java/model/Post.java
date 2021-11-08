package model;

import com.google.android.gms.maps.model.LatLng;

public class Post {

    private String postName;
    private String dateStart;
    private String dateEnd;
    private String location;
    private String businessName;
    private String UriImage;
    private LatLng coordenadas;

    //TODO poner coordenadas, hacer guetter y actualizar construcctor
    public Post(String postName, String dateStart, String dateEnd, String location, LatLng coordedanas) {
        this.postName = postName;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.location = location;
        this.coordenadas = coordedanas;
    }

    public Post() {
    }

    public String getPostName() {
        return postName;
    }

    public String getDateStart() {
        return dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public String getLocation() {
        return location;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getUriImage() {
        return UriImage;
    }

    public LatLng getCoordenadas() {
        return coordenadas;
    }
}
