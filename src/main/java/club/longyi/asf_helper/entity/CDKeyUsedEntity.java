package club.longyi.asf_helper.entity;


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
}
