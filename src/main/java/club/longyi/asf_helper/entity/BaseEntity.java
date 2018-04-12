package club.longyi.asf_helper.entity;


import com.sun.javafx.geom.transform.Identity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseEntity extends IdEntity implements Serializable, Cloneable {

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建IP
     */
    @Column(name = "create_IP")
    private String createIP;

    /**
     * 更新IP
     */
    @Column(name = "update_IP")
    private String updateIP;


}
