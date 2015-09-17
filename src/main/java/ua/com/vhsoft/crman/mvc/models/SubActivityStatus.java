package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sub_activity_statuses")
@NamedQueries({
    @NamedQuery(name = "SubActivityStatus.findAll", query = "SELECT s FROM SubActivityStatus s")})
public class SubActivityStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "activity_status_id")
    private Integer activityStatusId;
    @Size(max = 45)
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "activityStatusId", fetch = FetchType.EAGER)
    private Set<TblActivity> tblActivitySet;

    public SubActivityStatus() {
    }

    public SubActivityStatus(Integer activityStatusId) {
        this.activityStatusId = activityStatusId;
    }

    public Integer getActivityStatusId() {
        return activityStatusId;
    }

    public void setActivityStatusId(Integer activityStatusId) {
        this.activityStatusId = activityStatusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<TblActivity> getTblActivitySet() {
        return tblActivitySet;
    }

    public void setTblActivitySet(Set<TblActivity> tblActivitySet) {
        this.tblActivitySet = tblActivitySet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activityStatusId != null ? activityStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubActivityStatus)) {
            return false;
        }
        SubActivityStatus other = (SubActivityStatus) object;
        if ((this.activityStatusId == null && other.activityStatusId != null) || (this.activityStatusId != null && !this.activityStatusId.equals(other.activityStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubActivityStatus[ activityStatusId=" + activityStatusId + " ]";
    }
    
}
