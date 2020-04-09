package com.muscleape.influxdb;

import junit.framework.TestCase;
import org.influxdb.InfluxDB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * Created by mashengzhen on 2020/4/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InfluxDBAutoConfiguredTest{

    @Autowired
    private InfluxDBAutoConfigured influxDBAutoConfigured;

    @Test
    public void testAutoConfiguredInfluxDB() {
        InfluxDB influxDB = influxDBAutoConfigured.getInfluxDB();
        Assert.notNull(influxDB, "The autoconfigured influxDB is null");
    }

}