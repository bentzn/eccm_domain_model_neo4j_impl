package eu.europa.ec.digit.contentmanagement.domain.neo4j.entities;


import org.neo4j.ogm.annotation.*;

import eu.europa.ec.digit.contentmanagement.domain.api.entities.AbstractEntity_i;


/**
 * 
 * @author bentsth
 */
public class AbstractEntityNeo4jImpl implements AbstractEntity_i {
    
    public static final String REL_TYPE_CHILD_OF = "CHILD_OF";
    public static final String REL_TYPE_HAS_PARENT = "HAS_PARENT";
    public static final String REL_TYPE_BELONGS_TO = "BELONGS_TO";
    

    @Id
    @GeneratedValue
    private long id = -1;

    @Property
    @Index(unique = true)
    private String uuid = "" + super.hashCode();
    
    @Property
    private String name;

    public long getId() {
        return id;
    }


    @Override
    public String getUuid() {
        return uuid;
    }
    
    
    @Override
    public String getName() {
        return name;
    }
    
    
    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractEntityNeo4jImpl other = (AbstractEntityNeo4jImpl) obj;
        if (uuid == null) {
            if (other.uuid != null)
                return false;
        } else if (!uuid.equals(other.uuid))
            return false;
        return true;
    }
}
