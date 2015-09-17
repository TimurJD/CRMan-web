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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sub_address_types")
@NamedQueries({
    @NamedQuery(name = "SubAddressType.findAll", query = "SELECT s FROM SubAddressType s")})
public class SubAddressType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "address_type_id")
    private Integer addressTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "type_name")
    private String typeName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_corporative")
    private boolean isCorporative;
    @OneToMany(mappedBy = "addressTypeId", fetch = FetchType.EAGER)
    private Set<TblAddress> tblAddressSet;

    public SubAddressType() {
    }

    public SubAddressType(Integer addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public SubAddressType(Integer addressTypeId, String typeName, boolean isCorporative) {
        this.addressTypeId = addressTypeId;
        this.typeName = typeName;
        this.isCorporative = isCorporative;
    }

    public Integer getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(Integer addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean getIsCorporative() {
        return isCorporative;
    }

    public void setIsCorporative(boolean isCorporative) {
        this.isCorporative = isCorporative;
    }

    public Set<TblAddress> getTblAddressSet() {
        return tblAddressSet;
    }

    public void setTblAddressSet(Set<TblAddress> tblAddressSet) {
        this.tblAddressSet = tblAddressSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressTypeId != null ? addressTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubAddressType)) {
            return false;
        }
        SubAddressType other = (SubAddressType) object;
        if ((this.addressTypeId == null && other.addressTypeId != null) || (this.addressTypeId != null && !this.addressTypeId.equals(other.addressTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubAddressType[ addressTypeId=" + addressTypeId + " ]";
    }
    
}
