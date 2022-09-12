package models;

import java.util.Date;
import javax.persistence.*;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class AttachmentRefOrValue extends PanacheEntity {
    public String href;
    public String attachmentType;
    public String content;
    public String description;
    public boolean isRef;
    public String mimeType;
    public String name;
    public String url;
    public float size;
    public Date validFrom;
    public Date validUntil;
    @OneToOne(mappedBy = "attachment")
    private TaxExcemtionCertificate taxExcemtionCertificate;
    @OneToOne(mappedBy = "attachment")
    private IndividualIdentification individualIdentification;
    @OneToOne(mappedBy = "attachment")
    private OrganizationIdentification organizationIdentification;
}
