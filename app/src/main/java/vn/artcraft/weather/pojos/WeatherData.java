
package vn.artcraft.weather.pojos;

import com.squareup.moshi.Json;

public class WeatherData {

    @Json(name = "location")
    private Location location;
    @Json(name = "current")
    private Current current;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

}
