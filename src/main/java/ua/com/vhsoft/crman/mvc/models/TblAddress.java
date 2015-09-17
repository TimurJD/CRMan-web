package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "tbl_addresses")
@NamedQueries({
    @NamedQuery(name = "TblAddress.findAll", query = "SELECT t FROM TblAddress t")})
public class TblAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "address_id")
    private Integer addressId;
    @Size(max = 60)
    @Column(name = "street")
    private String street;
    @Size(max = 20)
    @Column(name = "building")
    private String building;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modified_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "is_main")
    private Boolean isMain;
    @Column(name = "record_state")
    private Boolean recordState;
    @OneToMany(mappedBy = "shippingAddressId", fetch = FetchType.EAGER)
    private Set<TblOrder> tblOrderSet;
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblAccount accountId;
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubCity cityId;
    @JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblContact contactId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser createdBy;
    @JoinColumn(name = "lead_id", referencedColumnName = "lead_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblLead leadId;
    @JoinColumn(name = "modified_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser modifiedBy;
    @JoinColumn(name = "address_type_id", referencedColumnName = "address_type_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubAddressType addressTypeId;

    public TblAddress() {
    }

    public TblAddress(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    public Boolean getRecordState() {
        return recordState;
    }

    public void setRecordState(Boolean recordState) {
        this.recordState = recordState;
    }

    public Set<TblOrder> getTblOrderSet() {
        return tblOrderSet;
    }

    public void setTblOrderSet(Set<TblOrder> tblOrderSet) {
        this.tblOrderSet = tblOrderSet;
    }

    public TblAccount getAccountId() {
        return accountId;
    }

    public void setAccountId(TblAccount accountId) {
        this.accountId = accountId;
    }

    public SubCity getCityId() {
        return cityId;
    }

    public void setCityId(SubCity cityId) {
        this.cityId = cityId;
    }

    public TblContact getContactId() {
        return contactId;
    }

    public void setContactId(TblContact contactId) {
        this.contactId = contactId;
    }

    public SysUser getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(SysUser createdBy) {
        this.createdBy = createdBy;
    }

    public TblLead getLeadId() {
        return leadId;
    }

    public void setLeadId(TblLead leadId) {
        this.leadId = leadId;
    }

    public SysUser getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(SysUser modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public SubAddressType getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(SubAddressType addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressId != null ? addressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblAddress)) {
            return false;
        }
        TblAddress other = (TblAddress) object;
        if ((this.addressId == null && other.addressId != null) || (this.addressId != null && !this.addressId.equals(other.addressId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblAddress[ addressId=" + addressId + " ]";
    }
    
}
