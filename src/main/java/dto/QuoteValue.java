package dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tLabel",
        "cLabel",
        "value",
        "unit",
        "position",
        "chartShow",
        "chartType",
        "color",
        "precision"
})
public class QuoteValue {

    @JsonProperty("tLabel")
    private String tLabel;
    @JsonProperty("cLabel")
    private String cLabel;
    @JsonProperty("value")
    private String value;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("chartShow")
    private Boolean chartShow;
    @JsonProperty("chartType")
    private String chartType;
    @JsonProperty("color")
    private String color;
    @JsonProperty("precision")
    private Integer precision;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tLabel")
    public String getTLabel() {
        return tLabel;
    }

    @JsonProperty("tLabel")
    public void setTLabel(String tLabel) {
        this.tLabel = tLabel;
    }

    public QuoteValue withTLabel(String tLabel) {
        this.tLabel = tLabel;
        return this;
    }

    @JsonProperty("cLabel")
    public String getCLabel() {
        return cLabel;
    }

    @JsonProperty("cLabel")
    public void setCLabel(String cLabel) {
        this.cLabel = cLabel;
    }

    public QuoteValue withCLabel(String cLabel) {
        this.cLabel = cLabel;
        return this;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public QuoteValue withValue(String value) {
        this.value = value;
        return this;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public QuoteValue withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    public QuoteValue withPosition(Integer position) {
        this.position = position;
        return this;
    }

    @JsonProperty("chartShow")
    public Boolean getChartShow() {
        return chartShow;
    }

    @JsonProperty("chartShow")
    public void setChartShow(Boolean chartShow) {
        this.chartShow = chartShow;
    }

    public QuoteValue withChartShow(Boolean chartShow) {
        this.chartShow = chartShow;
        return this;
    }

    @JsonProperty("chartType")
    public String getChartType() {
        return chartType;
    }

    @JsonProperty("chartType")
    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public QuoteValue withChartType(String chartType) {
        this.chartType = chartType;
        return this;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    public QuoteValue withColor(String color) {
        this.color = color;
        return this;
    }

    @JsonProperty("precision")
    public Integer getPrecision() {
        return precision;
    }

    @JsonProperty("precision")
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public QuoteValue withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public QuoteValue withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tLabel).append(cLabel).append(value).append(unit).append(position).append(chartShow).append(chartType).append(color).append(precision).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuoteValue) == false) {
            return false;
        }
        QuoteValue rhs = ((QuoteValue) other);
        return new EqualsBuilder().append(tLabel, rhs.tLabel).append(cLabel, rhs.cLabel).append(value, rhs.value).append(unit, rhs.unit).append(position, rhs.position).append(chartShow, rhs.chartShow).append(chartType, rhs.chartType).append(color, rhs.color).append(precision, rhs.precision).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
