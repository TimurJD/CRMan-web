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
@Table(name = "sub_opportunity_status")
@NamedQueries({
    @NamedQuery(name = "SubOpportunityStatus.findAll", query = "SELECT s FROM SubOpportunityStatus s")})
public class SubOpportunityStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "opportunity_status_id")
    private Integer opportunityStatusId;
    @Size(max = 45)
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "statusId", fetch = FetchType.EAGER)
    private Set<TblOpportunity> tblOpportunitySet;

    public SubOpportunityStatus() {
    }

    public SubOpportunityStatus(Integer opportunityStatusId) {
        this.opportunityStatusId = opportunityStatusId;
    }

    public Integer getOpportunityStatusId() {
        return opportunityStatusId;
    }

    public void setOpportunityStatusId(Integer opportunityStatusId) {
        this.opportunityStatusId = opportunityStatusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<TblOpportunity> getTblOpportunitySet() {
        return tblOpportunitySet;
    }

    public void setTblOpportunitySet(Set<TblOpportunity> tblOpportunitySet) {
        this.tblOpportunitySet = tblOpportunitySet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opportunityStatusId != null ? opportunityStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubOpportunityStatus)) {
            return false;
        }
        SubOpportunityStatus other = (SubOpportunityStatus) object;
        if ((this.opportunityStatusId == null && other.opportunityStatusId != null) || (this.opportunityStatusId != null && !this.opportunityStatusId.equals(other.opportunityStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubOpportunityStatus[ opportunityStatusId=" + opportunityStatusId + " ]";
    }
    
}
