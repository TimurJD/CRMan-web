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
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sub_communication_types")
@NamedQueries({
    @NamedQuery(name = "SubCommunicationType.findAll", query = "SELECT s FROM SubCommunicationType s")})
public class SubCommunicationType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "communication_type_id")
    private Integer communicationTypeId;
    @Size(max = 45)
    @Column(name = "type_name")
    private String typeName;
    
    public SubCommunicationType() {
    }

    public SubCommunicationType(Integer communicationTypeId) {
        this.communicationTypeId = communicationTypeId;
    }

    public Integer getCommunicationTypeId() {
        return communicationTypeId;
    }

    public void setCommunicationTypeId(Integer communicationTypeId) {
        this.communicationTypeId = communicationTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (communicationTypeId != null ? communicationTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCommunicationType)) {
            return false;
        }
        SubCommunicationType other = (SubCommunicationType) object;
        if ((this.communicationTypeId == null && other.communicationTypeId != null) || (this.communicationTypeId != null && !this.communicationTypeId.equals(other.communicationTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubCommunicationType[ communicationTypeId=" + communicationTypeId + " ]";
    }
    
}
