package com.zy.zmail.server.setting.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by wenliz on 2017/1/23.
 */
@Entity
public class SystemOption {
    public static int DOOR_SERVER_IP_ID = 100;
    public static int DOOR_SERVER_PORT_ID = 101;
    public static int DOOR_PROTOCOL_ID = 102;
    public static int TIME_OUT_ID = 120;
    public static int BUILDING_NO_ID = 121;
    public static int UNIT_NO_ID = 122;


    @Id
    private Integer optionId;
    private String optionName;
    private String valueType;
    private String charValue;
    private Integer intValue;
    private Timestamp dateValue;

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getCharValue() {
        return charValue;
    }

    public void setCharValue(String charValue) {
        this.charValue = charValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Timestamp getDateValue() {
        return dateValue;
    }

    public void setDateValue(Timestamp dateValue) {
        this.dateValue = dateValue;
    }
}
