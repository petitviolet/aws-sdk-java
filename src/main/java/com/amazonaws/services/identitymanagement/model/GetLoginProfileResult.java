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
package com.amazonaws.services.identitymanagement.model;
import java.io.Serializable;

/**
 * <p>
 * Contains the result of a successful invocation of the GetLoginProfile action.
 * </p>
 */
public class GetLoginProfileResult implements Serializable {

    /**
     * User name and password create date for the user.
     */
    private LoginProfile loginProfile;

    /**
     * User name and password create date for the user.
     *
     * @return User name and password create date for the user.
     */
    public LoginProfile getLoginProfile() {
        return loginProfile;
    }
    
    /**
     * User name and password create date for the user.
     *
     * @param loginProfile User name and password create date for the user.
     */
    public void setLoginProfile(LoginProfile loginProfile) {
        this.loginProfile = loginProfile;
    }
    
    /**
     * User name and password create date for the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loginProfile User name and password create date for the user.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetLoginProfileResult withLoginProfile(LoginProfile loginProfile) {
        this.loginProfile = loginProfile;
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
        if (getLoginProfile() != null) sb.append("LoginProfile: " + getLoginProfile() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoginProfile() == null) ? 0 : getLoginProfile().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetLoginProfileResult == false) return false;
        GetLoginProfileResult other = (GetLoginProfileResult)obj;
        
        if (other.getLoginProfile() == null ^ this.getLoginProfile() == null) return false;
        if (other.getLoginProfile() != null && other.getLoginProfile().equals(this.getLoginProfile()) == false) return false; 
        return true;
    }
    
}
    