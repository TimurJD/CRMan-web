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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author VH
 */
@Entity
@Table(name = "tbl_activities")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblActivity.findAll", query = "SELECT t FROM TblActivity t")})
public class TblActivity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "activity_id")
    private Integer activityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "title")
    private String title;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Lob
    @Size(max = 65535)
    @Column(name = "result_description")
    private String resultDescription;
    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "due_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "rel_lead_id")
    private Integer relLeadId;
    @Column(name = "record_state")
    private Boolean recordState;
    @JoinColumn(name = "result_id", referencedColumnName = "activity_result_id")
    @ManyToOne
    private SubActivityResult resultId;
    @JoinColumn(name = "rel_account_id", referencedColumnName = "account_id")
    @ManyToOne
    private TblAccount relAccountId;
    @JoinColumn(name = "rel_contact_id", referencedColumnName = "contact_id")
    @ManyToOne
    private TblContact relContactId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private SysUser createdBy;
    @JoinColumn(name = "rel_opportunity_id", referencedColumnName = "opportunity_id")
    @ManyToOne
    private TblOpportunity relOpportunityId;
    @JoinColumn(name = "owner_id", referencedColumnName = "user_id")
    @ManyToOne
    private SysUser ownerId;
    @JoinColumn(name = "priority_id", referencedColumnName = "priority_id")
    @ManyToOne
    private SubPriority priorityId;
    @JoinColumn(name = "activity_status_id", referencedColumnName = "activity_status_id")
    @ManyToOne
    private SubActivityStatus activityStatusId;
    @JoinColumn(name = "activity_type_id", referencedColumnName = "activity_type_id")
    @ManyToOne(optional = false)
    private SubActivityType activityTypeId;

    public TblActivity() {
    }

    public TblActivity(Integer activityId) {
        this.activityId = activityId;
    }

    public TblActivity(Integer activityId, String title, Date createdOn) {
        this.activityId = activityId;
        this.title = title;
        this.createdOn = createdOn;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
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

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getRelLeadId() {
        return relLeadId;
    }

    public void setRelLeadId(Integer relLeadId) {
        this.relLeadId = relLeadId;
    }

    public Boolean getRecordState() {
        return recordState;
    }

    public void setRecordState(Boolean recordState) {
        this.recordState = recordState;
    }

    public SubActivityResult getResultId() {
        return resultId;
    }

    public void setResultId(SubActivityResult resultId) {
        this.resultId = resultId;
    }

    public TblAccount getRelAccountId() {
        return relAccountId;
    }

    public void setRelAccountId(TblAccount relAccountId) {
        this.relAccountId = relAccountId;
    }

    public TblContact getRelContactId() {
        return relContactId;
    }

    public void setRelContactId(TblContact relContactId) {
        this.relContactId = relContactId;
    }

    public SysUser getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(SysUser createdBy) {
        this.createdBy = createdBy;
    }

    public TblOpportunity getRelOpportunityId() {
        return relOpportunityId;
    }

    public void setRelOpportunityId(TblOpportunity relOpportunityId) {
        this.relOpportunityId = relOpportunityId;
    }

    public SysUser getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(SysUser ownerId) {
        this.ownerId = ownerId;
    }

    public SubPriority getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(SubPriority priorityId) {
        this.priorityId = priorityId;
    }

    public SubActivityStatus getActivityStatusId() {
        return activityStatusId;
    }

    public void setActivityStatusId(SubActivityStatus activityStatusId) {
        this.activityStatusId = activityStatusId;
    }

    public SubActivityType getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(SubActivityType activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activityId != null ? activityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblActivity)) {
            return false;
        }
        TblActivity other = (TblActivity) object;
        if ((this.activityId == null && other.activityId != null) || (this.activityId != null && !this.activityId.equals(other.activityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblActivity[ activityId=" + activityId + " ]";
    }
    
}
