package com.zlf.practice.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

/**
 * 系统轧差配置
 *
 * @author louguanyang at 2018/9/12 09:32
 * @mail louguanyang@hzsuidifu.com
 */
public class SystemClearingConfig {

    /**
     * 系统轧差模式
     * @see
     */
    private Integer systemNettingMode;

    /**
     * 清算账号
     */
    private List<String> clearingAccountNo;

    /**
     * 轧差天数
     */
    private Integer clearingDay;

    /**
     *具体时间
     */
    private String dayTime;

    /**
     *product_code
     */
    String productCode;

    public Integer getSystemNettingMode() {
        return systemNettingMode;
    }

    public void setSystemNettingMode(Integer systemNettingMode) {
        this.systemNettingMode = systemNettingMode;
    }

    public List<String> getClearingAccountNo() {
        return clearingAccountNo;
    }

    public void setClearingAccountNo(List<String> clearingAccountNo) {
        this.clearingAccountNo = clearingAccountNo;
    }

    public Integer getClearingDay() {
        return clearingDay;
    }

    public void setClearingDay(Integer clearingDay) {
        this.clearingDay = clearingDay;
    }

    public String getDayTime(String time) {
        this.dayTime=time;return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
