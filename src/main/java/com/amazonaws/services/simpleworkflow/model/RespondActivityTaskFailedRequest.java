/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#respondActivityTaskFailed(RespondActivityTaskFailedRequest) RespondActivityTaskFailed operation}.
 * <p>
 * Used by workers to tell the service that the ActivityTask identified
 * by the <code>taskToken</code> has failed with <code>reason</code> (if
 * specified).
 * </p>
 * <p>
 * The <code>reason</code> and <code>details</code> appear in the
 * <code>ActivityTaskFailed</code> event added to the workflow history.
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#respondActivityTaskFailed(RespondActivityTaskFailedRequest)
 */
public class RespondActivityTaskFailedRequest extends AmazonWebServiceRequest {

    /**
     * The <code>taskToken</code> of the <a>ActivityTask</a>. <important> The
     * <code>taskToken</code> is generated by the service and should be
     * treated as an opaque value. If the task is passed to another process,
     * its <code>taskToken</code> must also be passed. This enables it to
     * provide its progress and respond with results. </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String taskToken;

    /**
     * Description of the error that may assist in diagnostics.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String reason;

    /**
     * Optional detailed information about the failure.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String details;

    /**
     * The <code>taskToken</code> of the <a>ActivityTask</a>. <important> The
     * <code>taskToken</code> is generated by the service and should be
     * treated as an opaque value. If the task is passed to another process,
     * its <code>taskToken</code> must also be passed. This enables it to
     * provide its progress and respond with results. </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return The <code>taskToken</code> of the <a>ActivityTask</a>. <important> The
     *         <code>taskToken</code> is generated by the service and should be
     *         treated as an opaque value. If the task is passed to another process,
     *         its <code>taskToken</code> must also be passed. This enables it to
     *         provide its progress and respond with results. </important>
     */
    public String getTaskToken() {
        return taskToken;
    }
    
    /**
     * The <code>taskToken</code> of the <a>ActivityTask</a>. <important> The
     * <code>taskToken</code> is generated by the service and should be
     * treated as an opaque value. If the task is passed to another process,
     * its <code>taskToken</code> must also be passed. This enables it to
     * provide its progress and respond with results. </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param taskToken The <code>taskToken</code> of the <a>ActivityTask</a>. <important> The
     *         <code>taskToken</code> is generated by the service and should be
     *         treated as an opaque value. If the task is passed to another process,
     *         its <code>taskToken</code> must also be passed. This enables it to
     *         provide its progress and respond with results. </important>
     */
    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }
    
    /**
     * The <code>taskToken</code> of the <a>ActivityTask</a>. <important> The
     * <code>taskToken</code> is generated by the service and should be
     * treated as an opaque value. If the task is passed to another process,
     * its <code>taskToken</code> must also be passed. This enables it to
     * provide its progress and respond with results. </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param taskToken The <code>taskToken</code> of the <a>ActivityTask</a>. <important> The
     *         <code>taskToken</code> is generated by the service and should be
     *         treated as an opaque value. If the task is passed to another process,
     *         its <code>taskToken</code> must also be passed. This enables it to
     *         provide its progress and respond with results. </important>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RespondActivityTaskFailedRequest withTaskToken(String taskToken) {
        this.taskToken = taskToken;
        return this;
    }
    
    
    /**
     * Description of the error that may assist in diagnostics.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return Description of the error that may assist in diagnostics.
     */
    public String getReason() {
        return reason;
    }
    
    /**
     * Description of the error that may assist in diagnostics.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param reason Description of the error that may assist in diagnostics.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    /**
     * Description of the error that may assist in diagnostics.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param reason Description of the error that may assist in diagnostics.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RespondActivityTaskFailedRequest withReason(String reason) {
        this.reason = reason;
        return this;
    }
    
    
    /**
     * Optional detailed information about the failure.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return Optional detailed information about the failure.
     */
    public String getDetails() {
        return details;
    }
    
    /**
     * Optional detailed information about the failure.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details Optional detailed information about the failure.
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    /**
     * Optional detailed information about the failure.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details Optional detailed information about the failure.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RespondActivityTaskFailedRequest withDetails(String details) {
        this.details = details;
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
        if (taskToken != null) sb.append("TaskToken: " + taskToken + ", ");
        if (reason != null) sb.append("Reason: " + reason + ", ");
        if (details != null) sb.append("Details: " + details + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskToken() == null) ? 0 : getTaskToken().hashCode()); 
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode()); 
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof RespondActivityTaskFailedRequest == false) return false;
        RespondActivityTaskFailedRequest other = (RespondActivityTaskFailedRequest)obj;
        
        if (other.getTaskToken() == null ^ this.getTaskToken() == null) return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false) return false; 
        if (other.getReason() == null ^ this.getReason() == null) return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        return true;
    }
    
}
    