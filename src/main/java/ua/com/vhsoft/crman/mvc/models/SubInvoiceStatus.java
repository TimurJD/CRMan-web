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
@Table(name = "sub_invoice_statuses")
@NamedQueries({
    @NamedQuery(name = "SubInvoiceStatus.findAll", query = "SELECT s FROM SubInvoiceStatus s")})
public class SubInvoiceStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "invoice_status_id")
    private Integer invoiceStatusId;
    @Size(max = 45)
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "statusId", fetch = FetchType.EAGER)
    private Set<TblInvoice> tblInvoiceSet;

    public SubInvoiceStatus() {
    }

    public SubInvoiceStatus(Integer invoiceStatusId) {
        this.invoiceStatusId = invoiceStatusId;
    }

    public Integer getInvoiceStatusId() {
        return invoiceStatusId;
    }

    public void setInvoiceStatusId(Integer invoiceStatusId) {
        this.invoiceStatusId = invoiceStatusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<TblInvoice> getTblInvoiceSet() {
        return tblInvoiceSet;
    }

    public void setTblInvoiceSet(Set<TblInvoice> tblInvoiceSet) {
        this.tblInvoiceSet = tblInvoiceSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceStatusId != null ? invoiceStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubInvoiceStatus)) {
            return false;
        }
        SubInvoiceStatus other = (SubInvoiceStatus) object;
        if ((this.invoiceStatusId == null && other.invoiceStatusId != null) || (this.invoiceStatusId != null && !this.invoiceStatusId.equals(other.invoiceStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubInvoiceStatus[ invoiceStatusId=" + invoiceStatusId + " ]";
    }
    
}
