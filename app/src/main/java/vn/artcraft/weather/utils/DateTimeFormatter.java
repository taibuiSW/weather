package vn.artcraft.weather.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static java.text.DateFormat.*;

public class DateTimeFormatter {
    private static final String INPUT_FORMAT = "yyyy-MM-dd hh:mm";

    private String mFormattedDate;
    private String mFormattedTime;

    public DateTimeFormatter(String dateTime) {
        Locale locale = Locale.getDefault();
        SimpleDateFormat formatter = new SimpleDateFormat(INPUT_FORMAT, locale);
        DateFormat date = getDateInstance(MEDIUM, locale);
        DateFormat time = getTimeInstance(SHORT, locale);
        try {
            Date inputDate = formatter.parse(dateTime);
            mFormattedDate = date.format(inputDate);
            mFormattedTime = time.format(inputDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getFormattedDate() {
        return mFormattedDate;
    }

    public String getFormattedTime() {
        return mFormattedTime;
    }
}
