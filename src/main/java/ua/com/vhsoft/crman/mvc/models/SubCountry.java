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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "sub_countries")
@NamedQueries({
    @NamedQuery(name = "SubCountry.findAll", query = "SELECT s FROM SubCountry s")})
public class SubCountry implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "country_id")
    private Integer countryId;
    @Size(max = 45)
    @Column(name = "country_name")
    private String countryName;
    @Size(max = 2)
    @Column(name = "country_code")
    private String countryCode;
    @Size(max = 5)
    @Column(name = "locale_code")
    private String localeCode;
    @OneToMany(mappedBy = "countryId", fetch = FetchType.EAGER)
    private Set<SubRegion> subRegionSet;
    @JoinColumn(name = "default_currency_id", referencedColumnName = "currency_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubCurrency defaultCurrencyId;
    @OneToMany(mappedBy = "countryId", fetch = FetchType.EAGER)
    private Set<TblProduct> tblProductSet;

    public SubCountry() {
    }

    public SubCountry(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    public Set<SubRegion> getSubRegionSet() {
        return subRegionSet;
    }

    public void setSubRegionSet(Set<SubRegion> subRegionSet) {
        this.subRegionSet = subRegionSet;
    }

    public SubCurrency getDefaultCurrencyId() {
        return defaultCurrencyId;
    }

    public void setDefaultCurrencyId(SubCurrency defaultCurrencyId) {
        this.defaultCurrencyId = defaultCurrencyId;
    }

    public Set<TblProduct> getTblProductSet() {
        return tblProductSet;
    }

    public void setTblProductSet(Set<TblProduct> tblProductSet) {
        this.tblProductSet = tblProductSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryId != null ? countryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCountry)) {
            return false;
        }
        SubCountry other = (SubCountry) object;
        if ((this.countryId == null && other.countryId != null) || (this.countryId != null && !this.countryId.equals(other.countryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubCountry[ countryId=" + countryId + " ]";
    }
    
}
