package club.longyi.asf_helper.entity;

import club.longyi.asf_helper.module.base.entity.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="cdkey_not_used_entity" )
public class CDKeyNotUsedEntity extends IdEntity {

    @Column(name = "cd_key")
    private String cdKey;

    //包含多少时间单位：天
    @Column(name = "duration")
    private short duration;


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
}
