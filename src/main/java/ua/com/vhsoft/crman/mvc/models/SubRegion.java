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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sub_regions")
@NamedQueries({
    @NamedQuery(name = "SubRegion.findAll", query = "SELECT s FROM SubRegion s")})
public class SubRegion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "region_id")
    private Integer regionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubCountry countryId;
    @OneToMany(mappedBy = "regionId", fetch = FetchType.EAGER)
    private Set<SubCity> subCitySet;

    public SubRegion() {
    }

    public SubRegion(Integer regionId) {
        this.regionId = regionId;
    }

    public SubRegion(Integer regionId, String name) {
        this.regionId = regionId;
        this.name = name;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubCountry getCountryId() {
        return countryId;
    }

    public void setCountryId(SubCountry countryId) {
        this.countryId = countryId;
    }

    public Set<SubCity> getSubCitySet() {
        return subCitySet;
    }

    public void setSubCitySet(Set<SubCity> subCitySet) {
        this.subCitySet = subCitySet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regionId != null ? regionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubRegion)) {
            return false;
        }
        SubRegion other = (SubRegion) object;
        if ((this.regionId == null && other.regionId != null) || (this.regionId != null && !this.regionId.equals(other.regionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubRegion[ regionId=" + regionId + " ]";
    }
    
}
