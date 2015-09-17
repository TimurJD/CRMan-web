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
@Table(name = "tbl_opportunities")
@NamedQueries({
    @NamedQuery(name = "TblOpportunity.findAll", query = "SELECT t FROM TblOpportunity t")})
public class TblOpportunity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "opportunity_id")
    private Integer opportunityId;
    @Size(max = 100)
    @Column(name = "opportunity_name")
    private String opportunityName;
    @Column(name = "closing_date")
    @Temporal(TemporalType.DATE)
    private Date closingDate;
    @Column(name = "probability")
    private Integer probability;
    @Column(name = "expected_revenue")
    private Long expectedRevenue;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Column(name = "record_state")
    private Boolean recordState;
    @OneToMany(mappedBy = "relOpportunityId", fetch = FetchType.EAGER)
    private Set<TblActivity> tblActivitySet;
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblAccount accountId;
    @JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblContact contactId;
    @JoinColumn(name = "revenue_currency_id", referencedColumnName = "currency_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubCurrency revenueCurrencyId;
    @JoinColumn(name = "owner_id", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser ownerId;
    @JoinColumn(name = "status_id", referencedColumnName = "opportunity_status_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubOpportunityStatus statusId;

    public TblOpportunity() {
    }

    public TblOpportunity(Integer opportunityId) {
        this.opportunityId = opportunityId;
    }

    public Integer getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(Integer opportunityId) {
        this.opportunityId = opportunityId;
    }

    public String getOpportunityName() {
        return opportunityName;
    }

    public void setOpportunityName(String opportunityName) {
        this.opportunityName = opportunityName;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public Long getExpectedRevenue() {
        return expectedRevenue;
    }

    public void setExpectedRevenue(Long expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
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

    public Set<TblActivity> getTblActivitySet() {
        return tblActivitySet;
    }

    public void setTblActivitySet(Set<TblActivity> tblActivitySet) {
        this.tblActivitySet = tblActivitySet;
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

    public SubCurrency getRevenueCurrencyId() {
        return revenueCurrencyId;
    }

    public void setRevenueCurrencyId(SubCurrency revenueCurrencyId) {
        this.revenueCurrencyId = revenueCurrencyId;
    }

    public SysUser getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(SysUser ownerId) {
        this.ownerId = ownerId;
    }

    public SubOpportunityStatus getStatusId() {
        return statusId;
    }

    public void setStatusId(SubOpportunityStatus statusId) {
        this.statusId = statusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opportunityId != null ? opportunityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblOpportunity)) {
            return false;
        }
        TblOpportunity other = (TblOpportunity) object;
        if ((this.opportunityId == null && other.opportunityId != null) || (this.opportunityId != null && !this.opportunityId.equals(other.opportunityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblOpportunity[ opportunityId=" + opportunityId + " ]";
    }
    
}
