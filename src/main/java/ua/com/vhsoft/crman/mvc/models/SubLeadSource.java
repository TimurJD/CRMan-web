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
@Table(name = "sub_lead_sources")
@NamedQueries({
    @NamedQuery(name = "SubLeadSource.findAll", query = "SELECT s FROM SubLeadSource s")})
public class SubLeadSource implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "lead_source_id")
    private Integer leadSourceId;
    @Size(max = 45)
    @Column(name = "lead_source")
    private String leadSource;
    @Size(max = 500)
    @Column(name = "description")
    private String description;

    public SubLeadSource() {
    }

    public SubLeadSource(Integer leadSourceId) {
        this.leadSourceId = leadSourceId;
    }

    public Integer getLeadSourceId() {
        return leadSourceId;
    }

    public void setLeadSourceId(Integer leadSourceId) {
        this.leadSourceId = leadSourceId;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
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
        hash += (leadSourceId != null ? leadSourceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubLeadSource)) {
            return false;
        }
        SubLeadSource other = (SubLeadSource) object;
        if ((this.leadSourceId == null && other.leadSourceId != null) || (this.leadSourceId != null && !this.leadSourceId.equals(other.leadSourceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubLeadSource[ leadSourceId=" + leadSourceId + " ]";
    }

}
