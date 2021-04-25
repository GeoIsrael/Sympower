package dto;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        "market",
        "date_applied",
        "values"
})
public class Quote {

    @JsonProperty("market")
    private String market;
    @JsonProperty("date_applied")
    private Long dateApplied;
    @JsonProperty("values")
    private List<QuoteValue> quoteValues = new ArrayList<QuoteValue>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("market")
    public String getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(String market) {
        this.market = market;
    }

    public Quote withMarket(String market) {
        this.market = market;
        return this;
    }

    @JsonProperty("date_applied")
    public Long getDateApplied() {
        return dateApplied;
    }

    @JsonProperty("date_applied")
    public void setDateApplied(Long dateApplied) {
        this.dateApplied = dateApplied;
    }

    public Quote withDateApplied(Long dateApplied) {
        this.dateApplied = dateApplied;
        return this;
    }

    @JsonProperty("values")
    public List<QuoteValue> getValues() {
        return quoteValues;
    }

    @JsonProperty("values")
    public void setValues(List<QuoteValue> quoteValues) {
        this.quoteValues = quoteValues;
    }

    public Quote withValues(List<QuoteValue> quoteValues) {
        this.quoteValues = quoteValues;
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

    public Quote withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(market).append(dateApplied).append(quoteValues).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Quote) == false) {
            return false;
        }
        Quote rhs = ((Quote) other);
        return new EqualsBuilder().append(market, rhs.market).append(dateApplied, rhs.dateApplied).append(quoteValues, rhs.quoteValues).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
