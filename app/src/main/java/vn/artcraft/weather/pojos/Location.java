
package vn.artcraft.weather.pojos;

import com.squareup.moshi.Json;

public class Location {

    @Json(name = "name")
    private String name;
    @Json(name = "region")
    private String region;
    @Json(name = "country")
    private String country;
    @Json(name = "lat")
    private double lat;
    @Json(name = "lon")
    private double lon;
    @Json(name = "tz_id")
    private String tzId;
    @Json(name = "localtime_epoch")
    private int localtimeEpoch;
    @Json(name = "localtime")
    private String localtime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getTzId() {
        return tzId;
    }

    public void setTzId(String tzId) {
        this.tzId = tzId;
    }

    public int getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    public void setLocaltimeEpoch(int localtimeEpoch) {
        this.localtimeEpoch = localtimeEpoch;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

}
