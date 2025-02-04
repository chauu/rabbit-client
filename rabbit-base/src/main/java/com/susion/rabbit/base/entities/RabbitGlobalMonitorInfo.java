package com.susion.rabbit.base.entities;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * susionwang at 2020-01-14
 */
@Entity
public class RabbitGlobalMonitorInfo {

    @Id(autoincrement = true)
    public Long id;

    public Long time;

    public String fpsIds;

    public String memoryIds;

    public String appStartId;

    public String pageSpeedIds;

    public String blockIds;

    public String slowMethodIds;

    public Long endTime;

    @Generated(hash = 1684721862)
    public RabbitGlobalMonitorInfo(Long id, Long time, String fpsIds,
            String memoryIds, String appStartId, String pageSpeedIds,
            String blockIds, String slowMethodIds, Long endTime) {
        this.id = id;
        this.time = time;
        this.fpsIds = fpsIds;
        this.memoryIds = memoryIds;
        this.appStartId = appStartId;
        this.pageSpeedIds = pageSpeedIds;
        this.blockIds = blockIds;
        this.slowMethodIds = slowMethodIds;
        this.endTime = endTime;
    }

    @Generated(hash = 1291211931)
    public RabbitGlobalMonitorInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTime() {
        return this.time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getFpsIds() {
        return this.fpsIds;
    }

    public void setFpsIds(String fpsIds) {
        this.fpsIds = fpsIds;
    }

    public String getMemoryIds() {
        return this.memoryIds;
    }

    public void setMemoryIds(String memoryIds) {
        this.memoryIds = memoryIds;
    }

    public String getAppStartId() {
        return this.appStartId;
    }

    public void setAppStartId(String appStartId) {
        this.appStartId = appStartId;
    }

    public String getPageSpeedIds() {
        return this.pageSpeedIds;
    }

    public void setPageSpeedIds(String pageSpeedIds) {
        this.pageSpeedIds = pageSpeedIds;
    }

    public String getBlockIds() {
        return this.blockIds;
    }

    public void setBlockIds(String blockIds) {
        this.blockIds = blockIds;
    }

    public String getSlowMethodIds() {
        return this.slowMethodIds;
    }

    public void setSlowMethodIds(String slowMethodIds) {
        this.slowMethodIds = slowMethodIds;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

}
