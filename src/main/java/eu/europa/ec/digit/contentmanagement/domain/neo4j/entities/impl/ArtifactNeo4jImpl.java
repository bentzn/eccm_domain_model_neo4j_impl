package eu.europa.ec.digit.contentmanagement.domain.neo4j.entities.impl;

import java.util.LinkedList;
import java.util.List;

import org.neo4j.ogm.annotation.*;

import eu.europa.ec.digit.contentmanagement.domain.api.entities.Artifact_i;
import eu.europa.ec.digit.contentmanagement.domain.api.entities.BaseType;
import eu.europa.ec.digit.contentmanagement.domain.neo4j.entities.AbstractRepositoryObjectNeo4jImpl;

/**
 * 
 * @author bentsth
 */
@NodeEntity("Artifact")
public class ArtifactNeo4jImpl extends AbstractRepositoryObjectNeo4jImpl implements Artifact_i {
    
    
    @Property
    private BaseType baseTypeDefinition;

    @Relationship(type=REL_TYPE_CHILD_OF, direction=Relationship.OUTGOING)
    private List<Artifact_i> parents;


    public ArtifactNeo4jImpl() {
    }


    public ArtifactNeo4jImpl(List<Artifact_i> parents) {
        this.parents = parents;
    }


    public ArtifactNeo4jImpl(String name, List<Artifact_i> parents) {
        setName(name);
        this.parents = parents;
    }


    @Override
    public BaseType getBaseType() {
        return baseTypeDefinition;
    }


    @Override
    public void setBaseType(BaseType baseTypeDefinition) {
        this.baseTypeDefinition = baseTypeDefinition;
    }
    


    @Override
    public List<Artifact_i> getParents() {
        return parents;
    }


    @Override
    public void setParents(List<Artifact_i> parents) {
        this.parents = parents;
    }


    @Override
    public void addParent(Artifact_i parent) {
        if (parents == null) {
            synchronized (this) {
                if (parents == null) {
                    parents = new LinkedList<>();
                }
            }
        }

        parents.add(parent);
    }


    @Override
    public String toString() {
        return "ArtifactNeo4jImpl [getId()=" + getId() + ", baseTypeDefinition=" + baseTypeDefinition + ", parents=" + (parents == null ? "null" : parents.size()) + "]";
    }

    
    
}
