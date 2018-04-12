package club.longyi.asf_helper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name ="cdkey_not_used_entity" )
public class CDKeyNotUsedEntity extends IdEntity {

    @Column(name = "cd_key")
    private String cdKey;

    //包含多少时间单位：天
    @Column(name = "duration")
    private short duration;

}
