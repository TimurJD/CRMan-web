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
@Table(name = "sub_relation_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubRelationType.findAll", query = "SELECT s FROM SubRelationType s")})
public class SubRelationType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "relation_type_id")
    private Integer relationTypeId;
    @Size(max = 45)
    @Column(name = "type_name")
    private String typeName;
    @OneToMany(mappedBy = "relationTypeId")
    private Set<TblLead> tblLeadSet;
    @OneToMany(mappedBy = "relationTypeId")
    private Set<TblContact> tblContactSet;

    public SubRelationType() {
    }

    public SubRelationType(Integer relationTypeId) {
        this.relationTypeId = relationTypeId;
    }

    public Integer getRelationTypeId() {
        return relationTypeId;
    }

    public void setRelationTypeId(Integer relationTypeId) {
        this.relationTypeId = relationTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @XmlTransient
    public Set<TblLead> getTblLeadSet() {
        return tblLeadSet;
    }

    public void setTblLeadSet(Set<TblLead> tblLeadSet) {
        this.tblLeadSet = tblLeadSet;
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
        hash += (relationTypeId != null ? relationTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubRelationType)) {
            return false;
        }
        SubRelationType other = (SubRelationType) object;
        if ((this.relationTypeId == null && other.relationTypeId != null) || (this.relationTypeId != null && !this.relationTypeId.equals(other.relationTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubRelationType[ relationTypeId=" + relationTypeId + " ]";
    }
    
}
