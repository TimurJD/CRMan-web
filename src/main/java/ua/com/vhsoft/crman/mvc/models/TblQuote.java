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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "tbl_quotes")
@NamedQueries({
    @NamedQuery(name = "TblQuote.findAll", query = "SELECT t FROM TblQuote t")})
public class TblQuote implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "quote_id")
    private Integer quoteId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "quote_name")
    private String quoteName;
    @Column(name = "valid_till")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validTill;
    @Column(name = "quantity")
    private Integer quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "unit_price")
    private Double unitPrice;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "record_state")
    private Integer recordState;
    @OneToMany(mappedBy = "quoteId", fetch = FetchType.EAGER)
    private Set<TblOrder> tblOrderSet;
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblAccount accountId;
    @JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblContact contactId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser createdBy;
    @JoinColumn(name = "owner_id", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser ownerId;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblProduct productId;
    @JoinColumn(name = "quote_stage_id", referencedColumnName = "quote_stage_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubQuoteStage quoteStageId;
    @JoinColumn(name = "unit_type_id", referencedColumnName = "unit_type_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubUnitType unitTypeId;

    public TblQuote() {
    }

    public TblQuote(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public TblQuote(Integer quoteId, String quoteName) {
        this.quoteId = quoteId;
        this.quoteName = quoteName;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
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

    public Integer getRecordState() {
        return recordState;
    }

    public void setRecordState(Integer recordState) {
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

    public SysUser getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(SysUser ownerId) {
        this.ownerId = ownerId;
    }

    public TblProduct getProductId() {
        return productId;
    }

    public void setProductId(TblProduct productId) {
        this.productId = productId;
    }

    public SubQuoteStage getQuoteStageId() {
        return quoteStageId;
    }

    public void setQuoteStageId(SubQuoteStage quoteStageId) {
        this.quoteStageId = quoteStageId;
    }

    public SubUnitType getUnitTypeId() {
        return unitTypeId;
    }

    public void setUnitTypeId(SubUnitType unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteId != null ? quoteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblQuote)) {
            return false;
        }
        TblQuote other = (TblQuote) object;
        if ((this.quoteId == null && other.quoteId != null) || (this.quoteId != null && !this.quoteId.equals(other.quoteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblQuote[ quoteId=" + quoteId + " ]";
    }
    
}
