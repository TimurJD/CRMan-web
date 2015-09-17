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
@Table(name = "tbl_accounts")
@NamedQueries({
    @NamedQuery(name = "TblAccount.findAll", query = "SELECT t FROM TblAccount t")})
public class TblAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "account_id")
    private Integer accountId;
    @Size(max = 100)
    @Column(name = "account_name")
    private String accountName;
    @Size(max = 200)
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "employees_count")
    private Integer employeesCount;
    @Column(name = "annual_revenue")
    private Long annualRevenue;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modified_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "record_state")
    private Boolean recordState;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser createdBy;
    @JoinColumn(name = "industry_id", referencedColumnName = "industry_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubIndustry industryId;
    @JoinColumn(name = "legal_form_id", referencedColumnName = "legal_form_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubLegalForm legalFormId;
    @JoinColumn(name = "modified_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser modifiedBy;
    @OneToMany(mappedBy = "parentAccount", fetch = FetchType.EAGER)
    private Set<TblAccount> tblAccountSet;
    @JoinColumn(name = "parent_account", referencedColumnName = "account_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblAccount parentAccount;
    @OneToMany(mappedBy = "accountId", fetch = FetchType.EAGER)
    private Set<TblOrder> tblOrderSet;
    @OneToMany(mappedBy = "accountId", fetch = FetchType.EAGER)
    private Set<TblCommunication> tblCommunicationSet;
    @OneToMany(mappedBy = "accountId", fetch = FetchType.EAGER)
    private Set<TblAddress> tblAddressSet;
    @OneToMany(mappedBy = "relAccountId", fetch = FetchType.EAGER)
    private Set<TblActivity> tblActivitySet;
    @OneToMany(mappedBy = "producerId", fetch = FetchType.EAGER)
    private Set<TblProduct> tblProductSet;
    @OneToMany(mappedBy = "vendorId", fetch = FetchType.EAGER)
    private Set<TblProduct> tblProductSet1;
    @OneToMany(mappedBy = "accountId", fetch = FetchType.EAGER)
    private Set<TblContract> tblContractSet;
    @OneToMany(mappedBy = "accountId", fetch = FetchType.EAGER)
    private Set<TblContact> tblContactSet;
    @OneToMany(mappedBy = "accountId", fetch = FetchType.EAGER)
    private Set<TblQuote> tblQuoteSet;
    @OneToMany(mappedBy = "accountId", fetch = FetchType.EAGER)
    private Set<TblOpportunity> tblOpportunitySet;

    public TblAccount() {
    }

    public TblAccount(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(Integer employeesCount) {
        this.employeesCount = employeesCount;
    }

    public Long getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(Long annualRevenue) {
        this.annualRevenue = annualRevenue;
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

    public Boolean getRecordState() {
        return recordState;
    }

    public void setRecordState(Boolean recordState) {
        this.recordState = recordState;
    }

    public SysUser getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(SysUser createdBy) {
        this.createdBy = createdBy;
    }

    public SubIndustry getIndustryId() {
        return industryId;
    }

    public void setIndustryId(SubIndustry industryId) {
        this.industryId = industryId;
    }

    public SubLegalForm getLegalFormId() {
        return legalFormId;
    }

    public void setLegalFormId(SubLegalForm legalFormId) {
        this.legalFormId = legalFormId;
    }

    public SysUser getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(SysUser modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Set<TblAccount> getTblAccountSet() {
        return tblAccountSet;
    }

    public void setTblAccountSet(Set<TblAccount> tblAccountSet) {
        this.tblAccountSet = tblAccountSet;
    }

    public TblAccount getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(TblAccount parentAccount) {
        this.parentAccount = parentAccount;
    }

    public Set<TblOrder> getTblOrderSet() {
        return tblOrderSet;
    }

    public void setTblOrderSet(Set<TblOrder> tblOrderSet) {
        this.tblOrderSet = tblOrderSet;
    }

    public Set<TblCommunication> getTblCommunicationSet() {
        return tblCommunicationSet;
    }

    public void setTblCommunicationSet(Set<TblCommunication> tblCommunicationSet) {
        this.tblCommunicationSet = tblCommunicationSet;
    }

    public Set<TblAddress> getTblAddressSet() {
        return tblAddressSet;
    }

    public void setTblAddressSet(Set<TblAddress> tblAddressSet) {
        this.tblAddressSet = tblAddressSet;
    }

    public Set<TblActivity> getTblActivitySet() {
        return tblActivitySet;
    }

    public void setTblActivitySet(Set<TblActivity> tblActivitySet) {
        this.tblActivitySet = tblActivitySet;
    }

    public Set<TblProduct> getTblProductSet() {
        return tblProductSet;
    }

    public void setTblProductSet(Set<TblProduct> tblProductSet) {
        this.tblProductSet = tblProductSet;
    }

    public Set<TblProduct> getTblProductSet1() {
        return tblProductSet1;
    }

    public void setTblProductSet1(Set<TblProduct> tblProductSet1) {
        this.tblProductSet1 = tblProductSet1;
    }

    public Set<TblContract> getTblContractSet() {
        return tblContractSet;
    }

    public void setTblContractSet(Set<TblContract> tblContractSet) {
        this.tblContractSet = tblContractSet;
    }

    public Set<TblContact> getTblContactSet() {
        return tblContactSet;
    }

    public void setTblContactSet(Set<TblContact> tblContactSet) {
        this.tblContactSet = tblContactSet;
    }

    public Set<TblQuote> getTblQuoteSet() {
        return tblQuoteSet;
    }

    public void setTblQuoteSet(Set<TblQuote> tblQuoteSet) {
        this.tblQuoteSet = tblQuoteSet;
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
        hash += (accountId != null ? accountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblAccount)) {
            return false;
        }
        TblAccount other = (TblAccount) object;
        if ((this.accountId == null && other.accountId != null) || (this.accountId != null && !this.accountId.equals(other.accountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblAccount[ accountId=" + accountId + " ]";
    }
    
}
