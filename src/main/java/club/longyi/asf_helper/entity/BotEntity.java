package club.longyi.asf_helper.entity;

import club.longyi.asf_helper.module.base.entity.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bot_tab")
public class BotEntity extends BaseEntity {
    @Column(name = "steam_login")
    private String SteamLogin;

    @Column(name = "steam_password")
    private String SteamPassword;

    @Column(name = "enabled")
    private boolean Enabled;

    @Column(name = "farm_offline")
    private boolean FarmOffline;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "userEntity_id")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "botEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LogEntity> logEntities;

    @OneToMany(mappedBy = "botEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CDKeyUsedEntity> cdKeyUsedEntities;

    public String getSteamLogin() {
        return SteamLogin;
    }

    public void setSteamLogin(String steamLogin) {
        SteamLogin = steamLogin;
    }

    public String getSteamPassword() {
        return SteamPassword;
    }

    public void setSteamPassword(String steamPassword) {
        SteamPassword = steamPassword;
    }

    public boolean isEnabled() {
        return Enabled;
    }

    public void setEnabled(boolean enabled) {
        Enabled = enabled;
    }

    public boolean isFarmOffline() {
        return FarmOffline;
    }

    public void setFarmOffline(boolean farmOffline) {
        FarmOffline = farmOffline;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public List<LogEntity> getLogEntities() {
        return logEntities;
    }

    public void setLogEntities(List<LogEntity> logEntities) {
        this.logEntities = logEntities;
    }

    public List<CDKeyUsedEntity> getCdKeyUsedEntities() {
        return cdKeyUsedEntities;
    }

    public void setCdKeyUsedEntities(List<CDKeyUsedEntity> cdKeyUsedEntities) {
        this.cdKeyUsedEntities = cdKeyUsedEntities;
    }
}
