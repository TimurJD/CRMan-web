package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sub_legal_forms")
@NamedQueries({
    @NamedQuery(name = "SubLegalForm.findAll", query = "SELECT s FROM SubLegalForm s")})
public class SubLegalForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "legal_form_id")
    private Integer legalFormId;
    @Size(max = 100)
    @Column(name = "legal_form")
    private String legalForm;

    public SubLegalForm() {
    }

    public SubLegalForm(Integer legalFormId) {
        this.legalFormId = legalFormId;
    }

    public Integer getLegalFormId() {
        return legalFormId;
    }

    public void setLegalFormId(Integer legalFormId) {
        this.legalFormId = legalFormId;
    }

    public String getLegalForm() {
        return legalForm;
    }

    public void setLegalForm(String legalForm) {
        this.legalForm = legalForm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (legalFormId != null ? legalFormId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubLegalForm)) {
            return false;
        }
        SubLegalForm other = (SubLegalForm) object;
        if ((this.legalFormId == null && other.legalFormId != null) || (this.legalFormId != null && !this.legalFormId.equals(other.legalFormId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubLegalForm[ legalFormId=" + legalFormId + " ]";
    }

}
