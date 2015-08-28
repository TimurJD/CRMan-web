package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author VH
 */
@Entity
@Table(name = "sys_positions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysPosition.findAll", query = "SELECT s FROM SysPosition s")})
public class SysPosition implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "position_id")
    private Integer positionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "position_name")
    private String positionName;
    @Size(max = 300)
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "positionId")
    private Set<SysUser> sysUserSet;
    @OneToMany(mappedBy = "positionId")
    private Set<TblContact> tblContactSet;

    public SysPosition() {
    }

    public SysPosition(Integer positionId) {
        this.positionId = positionId;
    }

    public SysPosition(Integer positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Set<SysUser> getSysUserSet() {
        return sysUserSet;
    }

    public void setSysUserSet(Set<SysUser> sysUserSet) {
        this.sysUserSet = sysUserSet;
    }

    @XmlTransient
    public Set<TblContact> getTblContactSet() {
        return tblContactSet;
    }

    public void setTblContactSet(Set<TblContact> tblContactSet) {
        this.tblContactSet = tblContactSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (positionId != null ? positionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysPosition)) {
            return false;
        }
        SysPosition other = (SysPosition) object;
        if ((this.positionId == null && other.positionId != null) || (this.positionId != null && !this.positionId.equals(other.positionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SysPosition[ positionId=" + positionId + " ]";
    }
    
}
