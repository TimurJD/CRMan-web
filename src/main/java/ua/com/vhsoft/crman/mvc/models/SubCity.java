package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
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
import javax.persistence.Table;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sub_cities")
@NamedQueries({
    @NamedQuery(name = "SubCity.findAll", query = "SELECT s FROM SubCity s")})
public class SubCity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "city_id")
    private Integer cityId;
    @JoinColumn(name = "region_id", referencedColumnName = "region_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubRegion regionId;
    @Column(name = "city_name")
    private String cityName;

    public SubCity() {
    }

    public SubCity(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public SubRegion getRegionId() {
        return regionId;
    }

    public void setRegionId(SubRegion regionId) {
        this.regionId = regionId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cityId != null ? cityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCity)) {
            return false;
        }
        SubCity other = (SubCity) object;
        if ((this.cityId == null && other.cityId != null) || (this.cityId != null && !this.cityId.equals(other.cityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubCity[ cityId=" + cityId + " ]";
    }

}
