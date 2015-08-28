package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "sub_activity_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubActivityType.findAll", query = "SELECT s FROM SubActivityType s")})
public class SubActivityType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "activity_type_id")
    private Integer activityTypeId;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Size(max = 500)
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activityTypeId")
    private Set<TblActivity> tblActivitySet;

    public SubActivityType() {
    }

    public SubActivityType(Integer activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public Integer getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(Integer activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Set<TblActivity> getTblActivitySet() {
        return tblActivitySet;
    }

    public void setTblActivitySet(Set<TblActivity> tblActivitySet) {
        this.tblActivitySet = tblActivitySet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activityTypeId != null ? activityTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubActivityType)) {
            return false;
        }
        SubActivityType other = (SubActivityType) object;
        if ((this.activityTypeId == null && other.activityTypeId != null) || (this.activityTypeId != null && !this.activityTypeId.equals(other.activityTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubActivityType[ activityTypeId=" + activityTypeId + " ]";
    }
    
}
