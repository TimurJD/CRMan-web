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
@Table(name = "sub_sex")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubSex.findAll", query = "SELECT s FROM SubSex s")})
public class SubSex implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sex_id")
    private Integer sexId;
    @Size(max = 10)
    @Column(name = "sex")
    private String sex;
    @OneToMany(mappedBy = "sexId")
    private Set<TblLead> tblLeadSet;
    @OneToMany(mappedBy = "sexId")
    private Set<TblContact> tblContactSet;

    public SubSex() {
    }

    public SubSex(Integer sexId) {
        this.sexId = sexId;
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
        hash += (sexId != null ? sexId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubSex)) {
            return false;
        }
        SubSex other = (SubSex) object;
        if ((this.sexId == null && other.sexId != null) || (this.sexId != null && !this.sexId.equals(other.sexId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubSex[ sexId=" + sexId + " ]";
    }
    
}
