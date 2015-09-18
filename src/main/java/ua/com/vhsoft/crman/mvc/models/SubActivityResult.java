package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "sub_activity_results")
@NamedQueries({
    @NamedQuery(name = "SubActivityResult.findAll", query = "SELECT s FROM SubActivityResult s")})
public class SubActivityResult implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "activity_result_id")
    private Integer activityResultId;
    @Size(max = 60)
    @Column(name = "activity_result")
    private String activityResult;
    

    public SubActivityResult() {
    }

    public SubActivityResult(Integer activityResultId) {
        this.activityResultId = activityResultId;
    }

    public Integer getActivityResultId() {
        return activityResultId;
    }

    public void setActivityResultId(Integer activityResultId) {
        this.activityResultId = activityResultId;
    }

    public String getActivityResult() {
        return activityResult;
    }

    public void setActivityResult(String activityResult) {
        this.activityResult = activityResult;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activityResultId != null ? activityResultId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubActivityResult)) {
            return false;
        }
        SubActivityResult other = (SubActivityResult) object;
        if ((this.activityResultId == null && other.activityResultId != null) || (this.activityResultId != null && !this.activityResultId.equals(other.activityResultId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubActivityResult[ activityResultId=" + activityResultId + " ]";
    }
    
}
