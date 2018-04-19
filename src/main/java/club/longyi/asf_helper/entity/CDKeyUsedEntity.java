package club.longyi.asf_helper.entity;


import club.longyi.asf_helper.module.base.entity.IdEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cdkey_used_entity")
public class CDKeyUsedEntity extends IdEntity {

    @Column(name = "cd_key")
    private String cdKey;

    //包含多少时间单位：天
    @Column(name = "duration")
    private short duration;


    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "botEntity_id")
    private BotEntity botEntity;

    @Column(name = "used_time")
    private Date usedTime;

    public String getCdKey() {
        return cdKey;
    }

    public void setCdKey(String cdKey) {
        this.cdKey = cdKey;
    }

    public short getDuration() {
        return duration;
    }

    public void setDuration(short duration) {
        this.duration = duration;
    }

    public BotEntity getBotEntity() {
        return botEntity;
    }

    public void setBotEntity(BotEntity botEntity) {
        this.botEntity = botEntity;
    }

    public Date getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }
}
