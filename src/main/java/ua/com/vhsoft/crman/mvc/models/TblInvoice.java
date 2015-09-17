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
@Table(name = "tbl_invoices")
@NamedQueries({
    @NamedQuery(name = "TblInvoice.findAll", query = "SELECT t FROM TblInvoice t")})
public class TblInvoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "invoice_id")
    private Integer invoiceId;
    @Size(max = 45)
    @Column(name = "invoice_number")
    private String invoiceNumber;
    @Size(max = 45)
    @Column(name = "invoice_name")
    private String invoiceName;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "due_date")
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    @Lob
    @Size(max = 65535)
    @Column(name = "additional_terms")
    private String additionalTerms;
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
    @OneToMany(mappedBy = "invoiceId", fetch = FetchType.EAGER)
    private Set<TblOrder> tblOrderSet;
    @JoinColumn(name = "contract_id", referencedColumnName = "contract_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblContract contractId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser createdBy;
    @JoinColumn(name = "modified_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser modifiedBy;
    @JoinColumn(name = "status_id", referencedColumnName = "invoice_status_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubInvoiceStatus statusId;

    public TblInvoice() {
    }

    public TblInvoice(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getAdditionalTerms() {
        return additionalTerms;
    }

    public void setAdditionalTerms(String additionalTerms) {
        this.additionalTerms = additionalTerms;
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

    public Set<TblOrder> getTblOrderSet() {
        return tblOrderSet;
    }

    public void setTblOrderSet(Set<TblOrder> tblOrderSet) {
        this.tblOrderSet = tblOrderSet;
    }

    public TblContract getContractId() {
        return contractId;
    }

    public void setContractId(TblContract contractId) {
        this.contractId = contractId;
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

    public SubInvoiceStatus getStatusId() {
        return statusId;
    }

    public void setStatusId(SubInvoiceStatus statusId) {
        this.statusId = statusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceId != null ? invoiceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblInvoice)) {
            return false;
        }
        TblInvoice other = (TblInvoice) object;
        if ((this.invoiceId == null && other.invoiceId != null) || (this.invoiceId != null && !this.invoiceId.equals(other.invoiceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblInvoice[ invoiceId=" + invoiceId + " ]";
    }
    
}
