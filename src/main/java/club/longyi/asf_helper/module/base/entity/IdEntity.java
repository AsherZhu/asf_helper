package club.longyi.asf_helper.module.base.entity;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class IdEntity  implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
