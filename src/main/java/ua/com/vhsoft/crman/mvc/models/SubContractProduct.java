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
@Table(name = "sub_contract_product")
@NamedQueries({
    @NamedQuery(name = "SubContractProduct.findAll", query = "SELECT s FROM SubContractProduct s")})
public class SubContractProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cp_id")
    private Integer cpId;
    @Column(name = "quanity")
    private Integer quanity;
    @Column(name = "unit_price")
    private Long unitPrice;
    @JoinColumn(name = "contract_id", referencedColumnName = "contract_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblContract contractId;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblProduct productId;
    @JoinColumn(name = "unit_type_id", referencedColumnName = "unit_type_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubUnitType unitTypeId;

    public SubContractProduct() {
    }

    public SubContractProduct(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getQuanity() {
        return quanity;
    }

    public void setQuanity(Integer quanity) {
        this.quanity = quanity;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public TblContract getContractId() {
        return contractId;
    }

    public void setContractId(TblContract contractId) {
        this.contractId = contractId;
    }

    public TblProduct getProductId() {
        return productId;
    }

    public void setProductId(TblProduct productId) {
        this.productId = productId;
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
        hash += (cpId != null ? cpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubContractProduct)) {
            return false;
        }
        SubContractProduct other = (SubContractProduct) object;
        if ((this.cpId == null && other.cpId != null) || (this.cpId != null && !this.cpId.equals(other.cpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubContractProduct[ cpId=" + cpId + " ]";
    }
    
}
