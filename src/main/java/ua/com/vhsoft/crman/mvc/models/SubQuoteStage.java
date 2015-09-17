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
@Table(name = "sub_quote_stages")
@NamedQueries({
    @NamedQuery(name = "SubQuoteStage.findAll", query = "SELECT s FROM SubQuoteStage s")})
public class SubQuoteStage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "quote_stage_id")
    private Integer quoteStageId;
    @Size(max = 45)
    @Column(name = "quote_stage")
    private String quoteStage;
    @OneToMany(mappedBy = "quoteStageId", fetch = FetchType.EAGER)
    private Set<TblQuote> tblQuoteSet;

    public SubQuoteStage() {
    }

    public SubQuoteStage(Integer quoteStageId) {
        this.quoteStageId = quoteStageId;
    }

    public Integer getQuoteStageId() {
        return quoteStageId;
    }

    public void setQuoteStageId(Integer quoteStageId) {
        this.quoteStageId = quoteStageId;
    }

    public String getQuoteStage() {
        return quoteStage;
    }

    public void setQuoteStage(String quoteStage) {
        this.quoteStage = quoteStage;
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
        hash += (quoteStageId != null ? quoteStageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubQuoteStage)) {
            return false;
        }
        SubQuoteStage other = (SubQuoteStage) object;
        if ((this.quoteStageId == null && other.quoteStageId != null) || (this.quoteStageId != null && !this.quoteStageId.equals(other.quoteStageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubQuoteStage[ quoteStageId=" + quoteStageId + " ]";
    }
    
}
