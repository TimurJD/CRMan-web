package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author VH
 */
@Entity
@Table(name = "tbl_orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblOrder.findAll", query = "SELECT t FROM TblOrder t")})
public class TblOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    @Size(max = 50)
    @Column(name = "order_name")
    private String orderName;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "unit_price")
    private Long unitPrice;
    @Column(name = "price_adjustments")
    private Long priceAdjustments;
    @Column(name = "tax")
    private Long tax;
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
    @JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
    @ManyToOne
    private TblContact contactId;
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    @ManyToOne
    private TblAccount accountId;
    @JoinColumn(name = "shipping_address_id", referencedColumnName = "address_id")
    @ManyToOne
    private TblAddress shippingAddressId;
    @JoinColumn(name = "contract_id", referencedColumnName = "contract_id")
    @ManyToOne
    private TblContract contractId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne
    private SysUser createdBy;
    @JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id")
    @ManyToOne
    private TblInvoice invoiceId;
    @JoinColumn(name = "modified_by", referencedColumnName = "user_id")
    @ManyToOne
    private SysUser modifiedBy;
    @JoinColumn(name = "order_owner_id", referencedColumnName = "user_id")
    @ManyToOne
    private SysUser orderOwnerId;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne
    private TblProduct productId;
    @JoinColumn(name = "order_status_id", referencedColumnName = "order_status_id")
    @ManyToOne
    private SubOrderStatus orderStatusId;
    @JoinColumn(name = "unit_type_id", referencedColumnName = "unit_type_id")
    @ManyToOne
    private SubUnitType unitTypeId;

    public TblOrder() {
    }

    public TblOrder(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getPriceAdjustments() {
        return priceAdjustments;
    }

    public void setPriceAdjustments(Long priceAdjustments) {
        this.priceAdjustments = priceAdjustments;
    }

    public Long getTax() {
        return tax;
    }

    public void setTax(Long tax) {
        this.tax = tax;
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

    public TblContact getContactId() {
        return contactId;
    }

    public void setContactId(TblContact contactId) {
        this.contactId = contactId;
    }

    public TblAccount getAccountId() {
        return accountId;
    }

    public void setAccountId(TblAccount accountId) {
        this.accountId = accountId;
    }

    public TblAddress getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(TblAddress shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
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

    public TblInvoice getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(TblInvoice invoiceId) {
        this.invoiceId = invoiceId;
    }

    public SysUser getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(SysUser modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public SysUser getOrderOwnerId() {
        return orderOwnerId;
    }

    public void setOrderOwnerId(SysUser orderOwnerId) {
        this.orderOwnerId = orderOwnerId;
    }

    public TblProduct getProductId() {
        return productId;
    }

    public void setProductId(TblProduct productId) {
        this.productId = productId;
    }

    public SubOrderStatus getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(SubOrderStatus orderStatusId) {
        this.orderStatusId = orderStatusId;
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
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblOrder)) {
            return false;
        }
        TblOrder other = (TblOrder) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblOrder[ orderId=" + orderId + " ]";
    }
    
}
