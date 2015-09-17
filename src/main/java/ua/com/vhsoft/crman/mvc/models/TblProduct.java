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
@Table(name = "tbl_products")
@NamedQueries({
    @NamedQuery(name = "TblProduct.findAll", query = "SELECT t FROM TblProduct t")})
public class TblProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Size(max = 100)
    @Column(name = "product_name")
    private String productName;
    @Column(name = "barcode")
    private Integer barcode;
    @Column(name = "serial_number")
    private Integer serialNumber;
    @Size(max = 200)
    @Column(name = "product_url")
    private String productUrl;
    @Column(name = "price")
    private Long price;
    @Column(name = "record_state")
    private Boolean recordState;
    @OneToMany(mappedBy = "productId", fetch = FetchType.EAGER)
    private Set<TblOrder> tblOrderSet;
    @OneToMany(mappedBy = "productId", fetch = FetchType.EAGER)
    private Set<SubContractProduct> subContractProductSet;
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubCountry countryId;
    @JoinColumn(name = "currency_id", referencedColumnName = "currency_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubCurrency currencyId;
    @JoinColumn(name = "producer_id", referencedColumnName = "account_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblAccount producerId;
    @JoinColumn(name = "product_type_id", referencedColumnName = "product_type_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubProductType productTypeId;
    @JoinColumn(name = "unit_type_id", referencedColumnName = "unit_type_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubUnitType unitTypeId;
    @JoinColumn(name = "vendor_id", referencedColumnName = "account_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblAccount vendorId;
    @OneToMany(mappedBy = "productId", fetch = FetchType.EAGER)
    private Set<TblQuote> tblQuoteSet;

    public TblProduct() {
    }

    public TblProduct(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getBarcode() {
        return barcode;
    }

    public void setBarcode(Integer barcode) {
        this.barcode = barcode;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
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

    public Set<SubContractProduct> getSubContractProductSet() {
        return subContractProductSet;
    }

    public void setSubContractProductSet(Set<SubContractProduct> subContractProductSet) {
        this.subContractProductSet = subContractProductSet;
    }

    public SubCountry getCountryId() {
        return countryId;
    }

    public void setCountryId(SubCountry countryId) {
        this.countryId = countryId;
    }

    public SubCurrency getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(SubCurrency currencyId) {
        this.currencyId = currencyId;
    }

    public TblAccount getProducerId() {
        return producerId;
    }

    public void setProducerId(TblAccount producerId) {
        this.producerId = producerId;
    }

    public SubProductType getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(SubProductType productTypeId) {
        this.productTypeId = productTypeId;
    }

    public SubUnitType getUnitTypeId() {
        return unitTypeId;
    }

    public void setUnitTypeId(SubUnitType unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    public TblAccount getVendorId() {
        return vendorId;
    }

    public void setVendorId(TblAccount vendorId) {
        this.vendorId = vendorId;
    }

    public Set<TblQuote> getTblQuoteSet() {
        return tblQuoteSet;
    }

    public void setTblQuoteSet(Set<TblQuote> tblQuoteSet) {
        this.tblQuoteSet = tblQuoteSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProduct)) {
            return false;
        }
        TblProduct other = (TblProduct) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblProduct[ productId=" + productId + " ]";
    }
    
}
