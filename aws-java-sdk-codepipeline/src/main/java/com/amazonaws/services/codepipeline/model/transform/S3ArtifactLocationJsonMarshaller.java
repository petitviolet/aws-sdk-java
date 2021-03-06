/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.codepipeline.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * S3ArtifactLocationMarshaller
 */
public class S3ArtifactLocationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(S3ArtifactLocation s3ArtifactLocation,
            StructuredJsonGenerator jsonGenerator) {

        if (s3ArtifactLocation == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (s3ArtifactLocation.getBucketName() != null) {
                jsonGenerator.writeFieldName("bucketName").writeValue(
                        s3ArtifactLocation.getBucketName());
            }
            if (s3ArtifactLocation.getObjectKey() != null) {
                jsonGenerator.writeFieldName("objectKey").writeValue(
                        s3ArtifactLocation.getObjectKey());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3ArtifactLocationJsonMarshaller instance;

    public static S3ArtifactLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ArtifactLocationJsonMarshaller();
        return instance;
    }

}
