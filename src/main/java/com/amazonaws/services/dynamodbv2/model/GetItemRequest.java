/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#getItem(GetItemRequest) GetItem operation}.
 * <p>
 * The <i>GetItem</i> operation returns a set of attributes for the item with the given primary key. If there is no matching item, <i>GetItem</i> does
 * not return any data.
 * </p>
 * <p>
 * <i>GetItem</i> provides an eventually consistent read by default. If your application requires a strongly consistent read, set <i>ConsistentRead</i>
 * to <code>true</code> . Although a strongly consistent read might take more time than an eventually consistent read, it always returns the last updated
 * value.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#getItem(GetItemRequest)
 */
public class GetItemRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The name of the table containing the requested item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve.
     */
    private java.util.Map<String,AttributeValue> key;

    /**
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<String> attributesToGet;

    /**
     * If set to <code>true</code>, then the operation uses strongly
     * consistent reads; otherwise, eventually consistent reads are used.
     */
    private Boolean consistentRead;

    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     */
    private String returnConsumedCapacity;

    /**
     * Default constructor for a new GetItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetItemRequest() {}
    
    /**
     * Constructs a new GetItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table containing the requested item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve.
     */
    public GetItemRequest(String tableName, java.util.Map<String,AttributeValue> key) {
        this.tableName = tableName;
        this.key = key;
    }

    
    
    /**
     * The name of the table containing the requested item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table containing the requested item.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table containing the requested item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table containing the requested item.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table containing the requested item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table containing the requested item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve.
     *
     * @return A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to retrieve.
     */
    public java.util.Map<String,AttributeValue> getKey() {
        
        return key;

    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve.
     *
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to retrieve.
     */
    public void setKey(java.util.Map<String,AttributeValue> key) {
        this.key = key;
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetItemRequest withKey(java.util.Map<String,AttributeValue> key) {
        setKey(key);
        return this;
    }
    
    /**
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result.
     */
    public java.util.List<String> getAttributesToGet() {
        
        return attributesToGet;
    }
    
    /**
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result.
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
        attributesToGetCopy.addAll(attributesToGet);
        this.attributesToGet = attributesToGetCopy;
    }
    
    /**
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetItemRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        for (String value : attributesToGet) {
            getAttributesToGet().add(value);
        }
        return this;
    }
    
    /**
     * The names of one or more attributes to retrieve. If no attribute names
     * are specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The names of one or more attributes to retrieve. If no attribute names
     *         are specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetItemRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
        } else {
            java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
            attributesToGetCopy.addAll(attributesToGet);
            this.attributesToGet = attributesToGetCopy;
        }

        return this;
    }
    
    /**
     * If set to <code>true</code>, then the operation uses strongly
     * consistent reads; otherwise, eventually consistent reads are used.
     *
     * @return If set to <code>true</code>, then the operation uses strongly
     *         consistent reads; otherwise, eventually consistent reads are used.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * If set to <code>true</code>, then the operation uses strongly
     * consistent reads; otherwise, eventually consistent reads are used.
     *
     * @param consistentRead If set to <code>true</code>, then the operation uses strongly
     *         consistent reads; otherwise, eventually consistent reads are used.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * If set to <code>true</code>, then the operation uses strongly
     * consistent reads; otherwise, eventually consistent reads are used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead If set to <code>true</code>, then the operation uses strongly
     *         consistent reads; otherwise, eventually consistent reads are used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetItemRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }
    
    
    /**
     * If set to <code>true</code>, then the operation uses strongly
     * consistent reads; otherwise, eventually consistent reads are used.
     *
     * @return If set to <code>true</code>, then the operation uses strongly
     *         consistent reads; otherwise, eventually consistent reads are used.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @return Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnConsumedCapacity
     */
    public GetItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
        return this;
    }
    
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnConsumedCapacity
     */
    public GetItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");    	
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");    	
        if (getKey() != null) sb.append("Key: " + getKey() + ",");    	
        if (getAttributesToGet() != null) sb.append("AttributesToGet: " + getAttributesToGet() + ",");    	
        if (isConsistentRead() != null) sb.append("ConsistentRead: " + isConsistentRead() + ",");    	
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetItemRequest == false) return false;
        GetItemRequest other = (GetItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    