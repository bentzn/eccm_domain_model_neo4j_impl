package eu.europa.ec.digit.contentmanagement.domain.neo4j.entities;

import org.neo4j.ogm.annotation.Relationship;

import eu.europa.ec.digit.contentmanagement.domain.api.entities.AbstractRepositoryObject_i;
import eu.europa.ec.digit.contentmanagement.domain.api.entities.Repository_i;

/**
 * 
 * @author bentsth
 */
public class AbstractRepositoryObjectNeo4jImpl extends AbstractEntityNeo4jImpl implements AbstractRepositoryObject_i {

    @Relationship(type = REL_TYPE_BELONGS_TO, direction = Relationship.OUTGOING)
    private Repository_i repository;


    @Override
    public Repository_i getRepository() {
        return repository;
    }


    @Override
    public void setRepository(Repository_i repository) {
        this.repository = repository;
    }

}
