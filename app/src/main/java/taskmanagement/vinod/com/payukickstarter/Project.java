package taskmanagement.vinod.com.payukickstarter;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by Vinod on 8/12/2017.
 */

public class Project implements Serializable {
    private String serialNumber;
    private String amountPledged;
    private String blurb;
    private String by;
    private String country;
    private String currency;
    private String endTime;
    private String location;
    private String percentage;
    private String numberBackers;
    private String state;
    private String title;
    private String type;
    private String url;

    public Project(JSONObject jsonObject) throws JSONException {
        if (jsonObject.has(ServiceConstant.JSON_KEY_SR_NO)) {
            setSerialNumber(jsonObject.getString(ServiceConstant.JSON_KEY_SR_NO));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_AMOUNT_PLEDGED)) {
            setAmountPledged(jsonObject.getString(ServiceConstant.JSON_KEY_AMOUNT_PLEDGED));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_BLURB)) {
            setBlurb(jsonObject.getString(ServiceConstant.JSON_KEY_BLURB));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_BY)) {
            setBy(jsonObject.getString(ServiceConstant.JSON_KEY_BY));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_COUNTRY)) {
            setCountry(jsonObject.getString(ServiceConstant.JSON_KEY_COUNTRY));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_CURRENCY)) {
            setCurrency(jsonObject.getString(ServiceConstant.JSON_KEY_CURRENCY));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_END_TIME)) {
            setEndTime(jsonObject.getString(ServiceConstant.JSON_KEY_END_TIME));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_LOCATION)) {
            setLocation(jsonObject.getString(ServiceConstant.JSON_KEY_LOCATION));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_PERCENTAGE)) {
            setPercentage(jsonObject.getString(ServiceConstant.JSON_KEY_PERCENTAGE));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_NUMBER_BANCKERS)) {
            setNumberBackers(jsonObject.getString(ServiceConstant.JSON_KEY_NUMBER_BANCKERS));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_STATE)) {
            setState(jsonObject.getString(ServiceConstant.JSON_KEY_STATE));
        }

        if (jsonObject.has(ServiceConstant.JSON_KEY_TITLE)) {
            setTitle(jsonObject.getString(ServiceConstant.JSON_KEY_TITLE));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_TYPE)) {
            setType(jsonObject.getString(ServiceConstant.JSON_KEY_TYPE));
        }
        if (jsonObject.has(ServiceConstant.JSON_KEY_URL)) {
            setUrl(jsonObject.getString(ServiceConstant.JSON_KEY_URL));
        }


    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAmountPledged() {
        return amountPledged;
    }

    public void setAmountPledged(String amountPledged) {
        this.amountPledged = amountPledged;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getNumberBackers() {
        return numberBackers;
    }

    public void setNumberBackers(String numberBackers) {
        this.numberBackers = numberBackers;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
