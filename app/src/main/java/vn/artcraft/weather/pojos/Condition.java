
package vn.artcraft.weather.pojos;

import com.squareup.moshi.Json;

public class Condition {

    @Json(name = "text")
    private String text;
    @Json(name = "icon")
    private String icon;
    @Json(name = "code")
    private int code;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return "https:" + icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
