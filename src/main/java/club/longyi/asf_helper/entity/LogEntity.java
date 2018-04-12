package club.longyi.asf_helper.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "log_tab")
public class LogEntity extends IdEntity {

    @Column(name = "log_time")
    private Date logTime;

    @Column(name = "attribute")
    private String attribute;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "botEntity_id")
    private BotEntity botEntity;

    @Column(name = "info")
    private String info;

}
