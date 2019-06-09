package mintfrost.cloud.repository.sensor.common;

import org.springframework.data.annotation.Id;

import java.util.Date;

public abstract class AbstractCommonDbEntity {
    @Id
    private String id;
    private java.util.Date date;
    private String value;

    public AbstractCommonDbEntity(Date date, String value) {
        this.date = date;
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public String getValue() {
        return value;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
