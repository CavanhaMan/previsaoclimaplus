package com.man.cavanha.previsaoclimaplus.model;

import java.util.HashMap;
import java.util.Map;

public class DadosClima {
    private Double latitude;
    private Double longitude;
    private String timezone;
    private Currently currently;
    private Integer offset;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getLatitude() {return latitude;}
    public void setLatitude(Double latitude) {this.latitude = latitude;}
    public Double getLongitude() {return longitude;}
    public void setLongitude(Double longitude) {this.longitude = longitude;}
    public String getTimezone() {return timezone;}
    public void setTimezone(String timezone) {this.timezone = timezone;}
    public Currently getCurrently() {return currently;}
    public void setCurrently(Currently currently) {this.currently = currently;}
    public Integer getOffset() {return offset;}
    public void setOffset(Integer offset) {this.offset = offset;}

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
