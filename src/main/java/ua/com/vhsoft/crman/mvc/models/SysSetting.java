package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sys_settings")
@NamedQueries({
    @NamedQuery(name = "SysSetting.findAll", query = "SELECT s FROM SysSetting s")})
public class SysSetting implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "setting_id")
    private Integer settingId;
    @Size(max = 200)
    @Column(name = "value")
    private String value;
    @JoinColumn(name = "setting_type_id", referencedColumnName = "setting_type_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysSettingType settingTypeId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser userId;

    public SysSetting() {
    }

    public SysSetting(Integer settingId) {
        this.settingId = settingId;
    }

    public Integer getSettingId() {
        return settingId;
    }

    public void setSettingId(Integer settingId) {
        this.settingId = settingId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SysSettingType getSettingTypeId() {
        return settingTypeId;
    }

    public void setSettingTypeId(SysSettingType settingTypeId) {
        this.settingTypeId = settingTypeId;
    }

    public SysUser getUserId() {
        return userId;
    }

    public void setUserId(SysUser userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (settingId != null ? settingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysSetting)) {
            return false;
        }
        SysSetting other = (SysSetting) object;
        if ((this.settingId == null && other.settingId != null) || (this.settingId != null && !this.settingId.equals(other.settingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SysSetting[ settingId=" + settingId + " ]";
    }
    
}
