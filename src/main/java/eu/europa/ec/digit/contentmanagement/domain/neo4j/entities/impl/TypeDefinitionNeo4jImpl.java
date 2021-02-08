package eu.europa.ec.digit.contentmanagement.domain.neo4j.entities.impl;

import org.neo4j.ogm.annotation.*;

import eu.europa.ec.digit.contentmanagement.domain.api.entities.BaseType;
import eu.europa.ec.digit.contentmanagement.domain.api.entities.TypeDefinition_i;
import eu.europa.ec.digit.contentmanagement.domain.neo4j.entities.AbstractRepositoryObjectNeo4jImpl;

/**
 * 
 * @author bentsth
 */
@NodeEntity("TypeDefinition")
public class TypeDefinitionNeo4jImpl extends AbstractRepositoryObjectNeo4jImpl implements TypeDefinition_i {
    
    @Property
    private String name;
    @Property
    private String displayName;
    @Property
    private String description;
    @Property
    private BaseType baseType;
    @Relationship(type = REL_TYPE_HAS_PARENT, direction = Relationship.OUTGOING)
    private TypeDefinition_i parentTypeDefinition;
    @Property
    private boolean creatable;
    @Property
    private boolean fileable;
    @Property
    private boolean queryable;
    @Property
    private boolean fulltextIndexed;
    @Property
    private boolean includedInSupertypeQuery;
    @Property
    private boolean controllablePolicy;
    @Property
    private boolean controllableAcl;
    @Property
    private boolean canCreateSubType;
    @Property
    private boolean canUpdateType;
    @Property
    private boolean canDeleteType;


    public TypeDefinitionNeo4jImpl() {

    }


    /*
     * Used for test!
     */
    public TypeDefinitionNeo4jImpl(String name, String displayName, String description) {
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.baseType = BaseType.DOCUMENT;
        this.parentTypeDefinition = null;
        this.creatable = false;
        this.fileable = false;
        this.queryable = false;
        this.fulltextIndexed = false;
        this.includedInSupertypeQuery = false;
        this.controllablePolicy = false;
        this.controllableAcl = false;
        this.canCreateSubType = false;
        this.canUpdateType = false;
        this.canDeleteType = false;
    }


    public TypeDefinitionNeo4jImpl(String name, String displayName, String description, BaseType baseType,
            TypeDefinition_i parentTypeDefinition, boolean creatable, boolean fileable, boolean queryable, boolean fulltextIndexed,
            boolean includedInSupertypeQuery, boolean controllablePolicy, boolean controllableAcl,
            boolean canCreateSubType, boolean canUpdateType, boolean canDeleteType) {
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.baseType = baseType;
        this.parentTypeDefinition = parentTypeDefinition;
        this.creatable = creatable;
        this.fileable = fileable;
        this.queryable = queryable;
        this.fulltextIndexed = fulltextIndexed;
        this.includedInSupertypeQuery = includedInSupertypeQuery;
        this.controllablePolicy = controllablePolicy;
        this.controllableAcl = controllableAcl;
        this.canCreateSubType = canCreateSubType;
        this.canUpdateType = canUpdateType;
        this.canDeleteType = canDeleteType;
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
    public String getDisplayName() {
        return displayName;
    }


    @Override
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
    public BaseType getBaseType() {
        return baseType;
    }


    @Override
    public void setBaseType(BaseType baseType) {
        this.baseType = baseType;
    }


    @Override
    public TypeDefinition_i getParentTypeDefinition() {
        return parentTypeDefinition;
    }


    @Override
    public void setParentTypeDefinition(TypeDefinition_i parentTypeDefinition) {
        this.parentTypeDefinition = parentTypeDefinition;
    }


    @Override
    public boolean isCreatable() {
        return creatable;
    }


    @Override
    public void setCreatable(boolean creatable) {
        this.creatable = creatable;
    }


    @Override
    public boolean isFileable() {
        return fileable;
    }


    @Override
    public void setFileable(boolean fileable) {
        this.fileable = fileable;
    }


    @Override
    public boolean isQueryable() {
        return queryable;
    }


    @Override
    public void setQueryable(boolean queryable) {
        this.queryable = queryable;
    }


    @Override
    public boolean isFulltextIndexed() {
        return fulltextIndexed;
    }


    @Override
    public void setFulltextIndexed(boolean fulltextIndexed) {
        this.fulltextIndexed = fulltextIndexed;
    }


    @Override
    public boolean isIncludedInSupertypeQuery() {
        return includedInSupertypeQuery;
    }


    @Override
    public void setIncludedInSupertypeQuery(boolean includedInSupertypeQuery) {
        this.includedInSupertypeQuery = includedInSupertypeQuery;
    }


    @Override
    public boolean isControllablePolicy() {
        return controllablePolicy;
    }


    @Override
    public void setControllablePolicy(boolean controllablePolicy) {
        this.controllablePolicy = controllablePolicy;
    }


    @Override
    public boolean isControllableAcl() {
        return controllableAcl;
    }


    @Override
    public void setControllableAcl(boolean controllableAcl) {
        this.controllableAcl = controllableAcl;
    }


    @Override
    public boolean canCreateSubType() {
        return canCreateSubType;
    }


    @Override
    public void setCanCreateSubType(boolean canCreateSubType) {
        this.canCreateSubType = canCreateSubType;
    }


    @Override
    public boolean canUpdateType() {
        return canUpdateType;
    }


    @Override
    public void setCanUpdateType(boolean canUpdateType) {
        this.canUpdateType = canUpdateType;
    }


    @Override
    public boolean canDeleteType() {
        return canDeleteType;
    }


    @Override
    public void setCanDeleteType(boolean canDeleteType) {
        this.canDeleteType = canDeleteType;
    }
}
