
package vn.artcraft.weather.pojos;

import com.squareup.moshi.Json;

public class Current {

    @Json(name = "last_updated_epoch")
    private int lastUpdatedEpoch;
    @Json(name = "last_updated")
    private String lastUpdated;
    @Json(name = "temp_c")
    private double tempC;
    @Json(name = "temp_f")
    private double tempF;
    @Json(name = "is_day")
    private int isDay;
    @Json(name = "condition")
    private Condition condition;
    @Json(name = "wind_mph")
    private double windMph;
    @Json(name = "wind_kph")
    private double windKph;
    @Json(name = "wind_degree")
    private int windDegree;
    @Json(name = "wind_dir")
    private String windDir;
    @Json(name = "pressure_mb")
    private double pressureMb;
    @Json(name = "pressure_in")
    private double pressureIn;
    @Json(name = "precip_mm")
    private double precipMm;
    @Json(name = "precip_in")
    private double precipIn;
    @Json(name = "humidity")
    private int humidity;
    @Json(name = "cloud")
    private int cloud;
    @Json(name = "feelslike_c")
    private double feelslikeC;
    @Json(name = "feelslike_f")
    private double feelslikeF;
    @Json(name = "vis_km")
    private double visKm;
    @Json(name = "vis_miles")
    private double visMiles;

    public int getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdatedEpoch(int lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getWindMph() {
        return windMph;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public double getWindKph() {
        return windKph;
    }

    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    public double getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public double getVisKm() {
        return visKm;
    }

    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }

    public double getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(double visMiles) {
        this.visMiles = visMiles;
    }

}
