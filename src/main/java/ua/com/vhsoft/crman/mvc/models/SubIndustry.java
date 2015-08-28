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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author VH
 */
@Entity
@Table(name = "sub_industries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubIndustry.findAll", query = "SELECT s FROM SubIndustry s")})
public class SubIndustry implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "industry_id")
    private Integer industryId;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "industryId")
    private Set<TblLead> tblLeadSet;
    @OneToMany(mappedBy = "industryId")
    private Set<TblAccount> tblAccountSet;

    public SubIndustry() {
    }

    public SubIndustry(Integer industryId) {
        this.industryId = industryId;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Set<TblLead> getTblLeadSet() {
        return tblLeadSet;
    }

    public void setTblLeadSet(Set<TblLead> tblLeadSet) {
        this.tblLeadSet = tblLeadSet;
    }

    @XmlTransient
    public Set<TblAccount> getTblAccountSet() {
        return tblAccountSet;
    }

    public void setTblAccountSet(Set<TblAccount> tblAccountSet) {
        this.tblAccountSet = tblAccountSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (industryId != null ? industryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubIndustry)) {
            return false;
        }
        SubIndustry other = (SubIndustry) object;
        if ((this.industryId == null && other.industryId != null) || (this.industryId != null && !this.industryId.equals(other.industryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubIndustry[ industryId=" + industryId + " ]";
    }
    
}
