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
@Table(name = "sub_currencies")
@NamedQueries({
    @NamedQuery(name = "SubCurrency.findAll", query = "SELECT s FROM SubCurrency s")})
public class SubCurrency implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "currency_id")
    private Integer currencyId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "currency_code")
    private String currencyCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "currency_name")
    private String currencyName;
    @OneToMany(mappedBy = "defaultCurrencyId", fetch = FetchType.EAGER)
    private Set<SubCountry> subCountrySet;
    @OneToMany(mappedBy = "currencyId", fetch = FetchType.EAGER)
    private Set<TblProduct> tblProductSet;
    @OneToMany(mappedBy = "revenueCurrencyId", fetch = FetchType.EAGER)
    private Set<TblOpportunity> tblOpportunitySet;

    public SubCurrency() {
    }

    public SubCurrency(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public SubCurrency(Integer currencyId, String currencyCode, String currencyName) {
        this.currencyId = currencyId;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Set<SubCountry> getSubCountrySet() {
        return subCountrySet;
    }

    public void setSubCountrySet(Set<SubCountry> subCountrySet) {
        this.subCountrySet = subCountrySet;
    }

    public Set<TblProduct> getTblProductSet() {
        return tblProductSet;
    }

    public void setTblProductSet(Set<TblProduct> tblProductSet) {
        this.tblProductSet = tblProductSet;
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
        hash += (currencyId != null ? currencyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCurrency)) {
            return false;
        }
        SubCurrency other = (SubCurrency) object;
        if ((this.currencyId == null && other.currencyId != null) || (this.currencyId != null && !this.currencyId.equals(other.currencyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubCurrency[ currencyId=" + currencyId + " ]";
    }
    
}
