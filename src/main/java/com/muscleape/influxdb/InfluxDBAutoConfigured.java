package com.muscleape.influxdb;

import lombok.Value;
import org.influxdb.InfluxDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mashengzhen on 2020/4/9.
 */
@Component
@Value
public class InfluxDBAutoConfigured {

    private final InfluxDB influxDB;

    @Autowired
    public InfluxDBAutoConfigured(InfluxDB influxDB) {
        this.influxDB = influxDB;
    }

}
