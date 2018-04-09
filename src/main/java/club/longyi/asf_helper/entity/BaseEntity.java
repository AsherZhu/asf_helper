package club.longyi.asf_helper.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseEntity implements Serializable, Cloneable {

    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateIP() {
        return createIP;
    }

    public void setCreateIP(String createIP) {
        this.createIP = createIP;
    }

    public String getUpdateIP() {
        return updateIP;
    }

    public void setUpdateIP(String updateIP) {
        this.updateIP = updateIP;
    }

    public BaseEntity(Date createTime, Date updateTime, String createIP, String updateIP) {
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createIP = createIP;
        this.updateIP = updateIP;
    }

    public BaseEntity() {
        super();
    }
}
