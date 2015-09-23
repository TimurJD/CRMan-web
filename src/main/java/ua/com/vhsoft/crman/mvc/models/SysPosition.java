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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sys_positions")
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
