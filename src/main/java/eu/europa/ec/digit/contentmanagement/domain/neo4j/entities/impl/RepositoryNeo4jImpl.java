package eu.europa.ec.digit.contentmanagement.domain.neo4j.entities.impl;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import eu.europa.ec.digit.contentmanagement.domain.api.entities.Repository_i;
import eu.europa.ec.digit.contentmanagement.domain.neo4j.entities.AbstractEntityNeo4jImpl;

/**
 * 
 * @author bentsth
 */
@NodeEntity("Repository")
public class RepositoryNeo4jImpl extends AbstractEntityNeo4jImpl implements Repository_i {

    @Property
    private String name;

    @Property
    private String description;

    @Property
    private long rootFolderId;


    public RepositoryNeo4jImpl() {

    }


    public RepositoryNeo4jImpl(String name, String description, long rootFolderId) {
        this.name = name;
        this.description = description;
        this.rootFolderId = rootFolderId;
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
    public String getDescription() {
        return description;
    }


    @Override
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public long getRootFolderId() {
        return rootFolderId;
    }


    @Override
    public void setRootFolderId(long rootFolderId) {
        this.rootFolderId = rootFolderId;
    }


    @Override
    public String toString() {
        return "RepositoryJpaImpl [getId()=" + getId() + ", getUuid()=" + getUuid() + ", name=" + name
                + ", description=" + description + "]";
    }

}
