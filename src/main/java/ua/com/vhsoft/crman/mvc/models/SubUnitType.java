package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "sub_unit_types")
@NamedQueries({
    @NamedQuery(name = "SubUnitType.findAll", query = "SELECT s FROM SubUnitType s")})
public class SubUnitType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "unit_type_id")
    private Integer unitTypeId;
    @Size(max = 45)
    @Column(name = "unit_type")
    private String unitType;
    @OneToMany(mappedBy = "unitTypeId", fetch = FetchType.EAGER)
    private Set<TblOrder> tblOrderSet;
    @OneToMany(mappedBy = "unitTypeId", fetch = FetchType.EAGER)
    private Set<SubContractProduct> subContractProductSet;
    @OneToMany(mappedBy = "unitTypeId", fetch = FetchType.EAGER)
    private Set<TblProduct> tblProductSet;
    @OneToMany(mappedBy = "unitTypeId", fetch = FetchType.EAGER)
    private Set<TblQuote> tblQuoteSet;

    public SubUnitType() {
    }

    public SubUnitType(Integer unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    public Integer getUnitTypeId() {
        return unitTypeId;
    }

    public void setUnitTypeId(Integer unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public Set<TblOrder> getTblOrderSet() {
        return tblOrderSet;
    }

    public void setTblOrderSet(Set<TblOrder> tblOrderSet) {
        this.tblOrderSet = tblOrderSet;
    }

    public Set<SubContractProduct> getSubContractProductSet() {
        return subContractProductSet;
    }

    public void setSubContractProductSet(Set<SubContractProduct> subContractProductSet) {
        this.subContractProductSet = subContractProductSet;
    }

    public Set<TblProduct> getTblProductSet() {
        return tblProductSet;
    }

    public void setTblProductSet(Set<TblProduct> tblProductSet) {
        this.tblProductSet = tblProductSet;
    }

    public Set<TblQuote> getTblQuoteSet() {
        return tblQuoteSet;
    }

    public void setTblQuoteSet(Set<TblQuote> tblQuoteSet) {
        this.tblQuoteSet = tblQuoteSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unitTypeId != null ? unitTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubUnitType)) {
            return false;
        }
        SubUnitType other = (SubUnitType) object;
        if ((this.unitTypeId == null && other.unitTypeId != null) || (this.unitTypeId != null && !this.unitTypeId.equals(other.unitTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubUnitType[ unitTypeId=" + unitTypeId + " ]";
    }
    
}
