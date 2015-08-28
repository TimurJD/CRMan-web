package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author VH
 */
@Entity
@Table(name = "tbl_contracts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblContract.findAll", query = "SELECT t FROM TblContract t")})
public class TblContract implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "contract_id")
    private Integer contractId;
    @Size(max = 45)
    @Column(name = "contract_number")
    private String contractNumber;
    @Size(max = 45)
    @Column(name = "contract_name")
    private String contractName;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modified_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Column(name = "record_state")
    private Boolean recordState;
    @OneToMany(mappedBy = "contractId")
    private Set<TblOrder> tblOrderSet;
    @OneToMany(mappedBy = "contractId")
    private Set<SubContractProduct> subContractProductSet;
    @OneToMany(mappedBy = "contractId")
    private Set<TblInvoice> tblInvoiceSet;
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    @ManyToOne
    private TblAccount accountId;
    @JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
    @ManyToOne
    private TblContact contactId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne
    private SysUser createdBy;
    @JoinColumn(name = "modified_by", referencedColumnName = "user_id")
    @ManyToOne
    private SysUser modifiedBy;
    @JoinColumn(name = "contract_owner_id", referencedColumnName = "user_id")
    @ManyToOne
    private SysUser contractOwnerId;

    public TblContract() {
    }

    public TblContract(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRecordState() {
        return recordState;
    }

    public void setRecordState(Boolean recordState) {
        this.recordState = recordState;
    }

    @XmlTransient
    public Set<TblOrder> getTblOrderSet() {
        return tblOrderSet;
    }

    public void setTblOrderSet(Set<TblOrder> tblOrderSet) {
        this.tblOrderSet = tblOrderSet;
    }

    @XmlTransient
    public Set<SubContractProduct> getSubContractProductSet() {
        return subContractProductSet;
    }

    public void setSubContractProductSet(Set<SubContractProduct> subContractProductSet) {
        this.subContractProductSet = subContractProductSet;
    }

    @XmlTransient
    public Set<TblInvoice> getTblInvoiceSet() {
        return tblInvoiceSet;
    }

    public void setTblInvoiceSet(Set<TblInvoice> tblInvoiceSet) {
        this.tblInvoiceSet = tblInvoiceSet;
    }

    public TblAccount getAccountId() {
        return accountId;
    }

    public void setAccountId(TblAccount accountId) {
        this.accountId = accountId;
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

    public SysUser getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(SysUser modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public SysUser getContractOwnerId() {
        return contractOwnerId;
    }

    public void setContractOwnerId(SysUser contractOwnerId) {
        this.contractOwnerId = contractOwnerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contractId != null ? contractId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblContract)) {
            return false;
        }
        TblContract other = (TblContract) object;
        if ((this.contractId == null && other.contractId != null) || (this.contractId != null && !this.contractId.equals(other.contractId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblContract[ contractId=" + contractId + " ]";
    }
    
}
