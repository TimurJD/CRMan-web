package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sys_users")
@NamedQueries({
    @NamedQuery(name = "SysUser.findAll", query = "SELECT s FROM SysUser s")})
public class SysUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "password_hash")
    private String passwordHash;
    @Column(name = "enabled")
    private Boolean enabled;
    @Size(max = 45)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 45)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 45)
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Size(max = 60)
    @Column(name = "created_by")
    private String createdBy;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId", fetch = FetchType.EAGER)
    private Set<SysLog> sysLogSet;
    @OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<TblLead> tblLeadSet;
    @OneToMany(mappedBy = "modifiedBy", fetch = FetchType.EAGER)
    private Set<TblLead> tblLeadSet1;
    @OneToMany(mappedBy = "leadOwnerId", fetch = FetchType.EAGER)
    private Set<TblLead> tblLeadSet2;
    @JoinColumn(name = "position_id", referencedColumnName = "position_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysPosition positionId;
    @OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<TblAccount> tblAccountSet;
    @OneToMany(mappedBy = "modifiedBy", fetch = FetchType.EAGER)
    private Set<TblAccount> tblAccountSet1;
    @OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<TblOrder> tblOrderSet;
    @OneToMany(mappedBy = "modifiedBy", fetch = FetchType.EAGER)
    private Set<TblOrder> tblOrderSet1;
    @OneToMany(mappedBy = "orderOwnerId", fetch = FetchType.EAGER)
    private Set<TblOrder> tblOrderSet2;
    @OneToMany(mappedBy = "userId", fetch = FetchType.EAGER)
    private Set<SysPermission> sysPermissionSet;
    @OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<TblCommunication> tblCommunicationSet;
    @OneToMany(mappedBy = "modifiedBy", fetch = FetchType.EAGER)
    private Set<TblCommunication> tblCommunicationSet1;
    @OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<TblInvoice> tblInvoiceSet;
    @OneToMany(mappedBy = "modifiedBy", fetch = FetchType.EAGER)
    private Set<TblInvoice> tblInvoiceSet1;
    @OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<TblAddress> tblAddressSet;
    @OneToMany(mappedBy = "modifiedBy", fetch = FetchType.EAGER)
    private Set<TblAddress> tblAddressSet1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<TblActivity> tblActivitySet;
    @OneToMany(mappedBy = "ownerId", fetch = FetchType.EAGER)
    private Set<TblActivity> tblActivitySet1;
    @OneToMany(mappedBy = "userId", fetch = FetchType.EAGER)
    private Set<SysSetting> sysSettingSet;
    @OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<TblContract> tblContractSet;
    @OneToMany(mappedBy = "modifiedBy", fetch = FetchType.EAGER)
    private Set<TblContract> tblContractSet1;
    @OneToMany(mappedBy = "contractOwnerId", fetch = FetchType.EAGER)
    private Set<TblContract> tblContractSet2;
    @OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<TblContact> tblContactSet;
    @OneToMany(mappedBy = "modifiedBy", fetch = FetchType.EAGER)
    private Set<TblContact> tblContactSet1;
    @OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER)
    private Set<TblQuote> tblQuoteSet;
    @OneToMany(mappedBy = "ownerId", fetch = FetchType.EAGER)
    private Set<TblQuote> tblQuoteSet1;
    @OneToMany(mappedBy = "ownerId", fetch = FetchType.EAGER)
    private Set<TblOpportunity> tblOpportunitySet;

    public SysUser() {
    }

    public SysUser(Integer userId) {
        this.userId = userId;
    }

    public SysUser(Integer userId, String login, String passwordHash) {
        this.userId = userId;
        this.login = login;
        this.passwordHash = passwordHash;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Set<SysLog> getSysLogSet() {
        return sysLogSet;
    }

    public void setSysLogSet(Set<SysLog> sysLogSet) {
        this.sysLogSet = sysLogSet;
    }

    public Set<TblLead> getTblLeadSet() {
        return tblLeadSet;
    }

    public void setTblLeadSet(Set<TblLead> tblLeadSet) {
        this.tblLeadSet = tblLeadSet;
    }

    public Set<TblLead> getTblLeadSet1() {
        return tblLeadSet1;
    }

    public void setTblLeadSet1(Set<TblLead> tblLeadSet1) {
        this.tblLeadSet1 = tblLeadSet1;
    }

    public Set<TblLead> getTblLeadSet2() {
        return tblLeadSet2;
    }

    public void setTblLeadSet2(Set<TblLead> tblLeadSet2) {
        this.tblLeadSet2 = tblLeadSet2;
    }

    public SysPosition getPositionId() {
        return positionId;
    }

    public void setPositionId(SysPosition positionId) {
        this.positionId = positionId;
    }

    public Set<TblAccount> getTblAccountSet() {
        return tblAccountSet;
    }

    public void setTblAccountSet(Set<TblAccount> tblAccountSet) {
        this.tblAccountSet = tblAccountSet;
    }

    public Set<TblAccount> getTblAccountSet1() {
        return tblAccountSet1;
    }

    public void setTblAccountSet1(Set<TblAccount> tblAccountSet1) {
        this.tblAccountSet1 = tblAccountSet1;
    }

    public Set<TblOrder> getTblOrderSet() {
        return tblOrderSet;
    }

    public void setTblOrderSet(Set<TblOrder> tblOrderSet) {
        this.tblOrderSet = tblOrderSet;
    }

    public Set<TblOrder> getTblOrderSet1() {
        return tblOrderSet1;
    }

    public void setTblOrderSet1(Set<TblOrder> tblOrderSet1) {
        this.tblOrderSet1 = tblOrderSet1;
    }

    public Set<TblOrder> getTblOrderSet2() {
        return tblOrderSet2;
    }

    public void setTblOrderSet2(Set<TblOrder> tblOrderSet2) {
        this.tblOrderSet2 = tblOrderSet2;
    }

    public Set<SysPermission> getSysPermissionSet() {
        return sysPermissionSet;
    }

    public void setSysPermissionSet(Set<SysPermission> sysPermissionSet) {
        this.sysPermissionSet = sysPermissionSet;
    }

    public Set<TblCommunication> getTblCommunicationSet() {
        return tblCommunicationSet;
    }

    public void setTblCommunicationSet(Set<TblCommunication> tblCommunicationSet) {
        this.tblCommunicationSet = tblCommunicationSet;
    }

    public Set<TblCommunication> getTblCommunicationSet1() {
        return tblCommunicationSet1;
    }

    public void setTblCommunicationSet1(Set<TblCommunication> tblCommunicationSet1) {
        this.tblCommunicationSet1 = tblCommunicationSet1;
    }

    public Set<TblInvoice> getTblInvoiceSet() {
        return tblInvoiceSet;
    }

    public void setTblInvoiceSet(Set<TblInvoice> tblInvoiceSet) {
        this.tblInvoiceSet = tblInvoiceSet;
    }

    public Set<TblInvoice> getTblInvoiceSet1() {
        return tblInvoiceSet1;
    }

    public void setTblInvoiceSet1(Set<TblInvoice> tblInvoiceSet1) {
        this.tblInvoiceSet1 = tblInvoiceSet1;
    }

    public Set<TblAddress> getTblAddressSet() {
        return tblAddressSet;
    }

    public void setTblAddressSet(Set<TblAddress> tblAddressSet) {
        this.tblAddressSet = tblAddressSet;
    }

    public Set<TblAddress> getTblAddressSet1() {
        return tblAddressSet1;
    }

    public void setTblAddressSet1(Set<TblAddress> tblAddressSet1) {
        this.tblAddressSet1 = tblAddressSet1;
    }

    public Set<TblActivity> getTblActivitySet() {
        return tblActivitySet;
    }

    public void setTblActivitySet(Set<TblActivity> tblActivitySet) {
        this.tblActivitySet = tblActivitySet;
    }

    public Set<TblActivity> getTblActivitySet1() {
        return tblActivitySet1;
    }

    public void setTblActivitySet1(Set<TblActivity> tblActivitySet1) {
        this.tblActivitySet1 = tblActivitySet1;
    }

    public Set<SysSetting> getSysSettingSet() {
        return sysSettingSet;
    }

    public void setSysSettingSet(Set<SysSetting> sysSettingSet) {
        this.sysSettingSet = sysSettingSet;
    }

    public Set<TblContract> getTblContractSet() {
        return tblContractSet;
    }

    public void setTblContractSet(Set<TblContract> tblContractSet) {
        this.tblContractSet = tblContractSet;
    }

    public Set<TblContract> getTblContractSet1() {
        return tblContractSet1;
    }

    public void setTblContractSet1(Set<TblContract> tblContractSet1) {
        this.tblContractSet1 = tblContractSet1;
    }

    public Set<TblContract> getTblContractSet2() {
        return tblContractSet2;
    }

    public void setTblContractSet2(Set<TblContract> tblContractSet2) {
        this.tblContractSet2 = tblContractSet2;
    }

    public Set<TblContact> getTblContactSet() {
        return tblContactSet;
    }

    public void setTblContactSet(Set<TblContact> tblContactSet) {
        this.tblContactSet = tblContactSet;
    }

    public Set<TblContact> getTblContactSet1() {
        return tblContactSet1;
    }

    public void setTblContactSet1(Set<TblContact> tblContactSet1) {
        this.tblContactSet1 = tblContactSet1;
    }

    public Set<TblQuote> getTblQuoteSet() {
        return tblQuoteSet;
    }

    public void setTblQuoteSet(Set<TblQuote> tblQuoteSet) {
        this.tblQuoteSet = tblQuoteSet;
    }

    public Set<TblQuote> getTblQuoteSet1() {
        return tblQuoteSet1;
    }

    public void setTblQuoteSet1(Set<TblQuote> tblQuoteSet1) {
        this.tblQuoteSet1 = tblQuoteSet1;
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
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysUser)) {
            return false;
        }
        SysUser other = (SysUser) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SysUser[ userId=" + userId + " ]";
    }
    
}
