package com.man.cavanha.previsaoclimaplus.model;
import java.util.HashMap;
import java.util.Map;

public class Currently {

    private Integer time;
    private String summary;
    private String icon; //ESTE É O ITEM A SER CAPTURADO!
    private Integer nearestStormDistance;
    private Double precipIntensity;
    private Double precipIntensityError;
    private Integer precipProbability;
    private String precipType;
    private Double temperature;
    private Double apparentTemperature;
    private Double dewPoint;
    private Double humidity;
    private Double pressure;
    private Double windSpeed;
    private Double windGust;
    private Integer windBearing;
    private Double cloudCover;
    private Integer uvIndex;
    private Integer visibility;
    private Double ozone;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getIcon() {return icon;}
    public void setIcon(String icon) {this.icon = icon;}

    public Integer getTime() {return time;}
    public void setTime(Integer time) {this.time = time;}
    public String getSummary() {return summary;}
    public void setSummary(String summary) {this.summary = summary;}
    public Integer getNearestStormDistance() {return nearestStormDistance;}
    public void setNearestStormDistance(Integer nearestStormDistance) {this.nearestStormDistance = nearestStormDistance;}
    public Double getPrecipIntensity() {return precipIntensity;}
    public void setPrecipIntensity(Double precipIntensity) {this.precipIntensity = precipIntensity;}
    public Double getPrecipIntensityError() {return precipIntensityError;}
    public void setPrecipIntensityError(Double precipIntensityError) {this.precipIntensityError = precipIntensityError;}
    public Integer getPrecipProbability() {return precipProbability;}
    public void setPrecipProbability(Integer precipProbability) {this.precipProbability = precipProbability;}
    public String getPrecipType() {return precipType;}
    public void setPrecipType(String precipType) {this.precipType = precipType;}
    public Double getTemperature() {return temperature;}
    public void setTemperature(Double temperature) {this.temperature = temperature;}
    public Double getApparentTemperature() {return apparentTemperature;}
    public void setApparentTemperature(Double apparentTemperature) {this.apparentTemperature = apparentTemperature;}
    public Double getDewPoint() {return dewPoint;}
    public void setDewPoint(Double dewPoint) {this.dewPoint = dewPoint;}
    public Double getHumidity() {return humidity;}
    public void setHumidity(Double humidity) {this.humidity = humidity;}
    public Double getPressure() {return pressure;}
    public void setPressure(Double pressure) {this.pressure = pressure;}
    public Double getWindSpeed() {return windSpeed;}
    public void setWindSpeed(Double windSpeed) {this.windSpeed = windSpeed;}
    public Double getWindGust() {return windGust;}
    public void setWindGust(Double windGust) {this.windGust = windGust;}
    public Integer getWindBearing() {return windBearing;}
    public void setWindBearing(Integer windBearing) {this.windBearing = windBearing;}
    public Double getCloudCover() {return cloudCover;}
    public void setCloudCover(Double cloudCover) {this.cloudCover = cloudCover;}
    public Integer getUvIndex() {return uvIndex;}
    public void setUvIndex(Integer uvIndex) {this.uvIndex = uvIndex;}
    public Integer getVisibility() {return visibility;}
    public void setVisibility(Integer visibility) {this.visibility = visibility;}
    public Double getOzone() {return ozone;}
    public void setOzone(Double ozone) {this.ozone = ozone;}
    public Map<String, Object> getAdditionalProperties() {return this.additionalProperties;}
    public void setAdditionalProperty(String name, Object value) {this.additionalProperties.put(name, value);}

}