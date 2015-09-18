package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sys_setting_types")
@NamedQueries({
    @NamedQuery(name = "SysSettingType.findAll", query = "SELECT s FROM SysSettingType s")})
public class SysSettingType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "setting_type_id")
    private Integer settingTypeId;
    @Size(max = 45)
    @Column(name = "type_name")
    private String typeName;
    @Size(max = 300)
    @Column(name = "type_description")
    private String typeDescription;

    public SysSettingType() {
    }

    public SysSettingType(Integer settingTypeId) {
        this.settingTypeId = settingTypeId;
    }

    public Integer getSettingTypeId() {
        return settingTypeId;
    }

    public void setSettingTypeId(Integer settingTypeId) {
        this.settingTypeId = settingTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (settingTypeId != null ? settingTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysSettingType)) {
            return false;
        }
        SysSettingType other = (SysSettingType) object;
        if ((this.settingTypeId == null && other.settingTypeId != null) || (this.settingTypeId != null && !this.settingTypeId.equals(other.settingTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SysSettingType[ settingTypeId=" + settingTypeId + " ]";
    }
    
}
