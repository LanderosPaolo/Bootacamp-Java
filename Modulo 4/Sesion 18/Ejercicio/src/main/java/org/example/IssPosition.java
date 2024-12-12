package org.example;

public class IssPosition {
    public String latitude;
    public String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "IssPosition{" +
                "latitud='" + latitude + '\'' +
                ", longitud='" + longitude + '\'' +
                '}';
    }
}
