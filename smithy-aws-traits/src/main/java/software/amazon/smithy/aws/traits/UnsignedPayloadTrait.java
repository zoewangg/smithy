/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package software.amazon.smithy.aws.traits;

import software.amazon.smithy.model.FromSourceLocation;
import software.amazon.smithy.model.SourceLocation;
import software.amazon.smithy.model.shapes.ShapeId;
import software.amazon.smithy.model.traits.BooleanTrait;

/**
 * Indicates that the payload of an operation is not to be signed.
 */
public final class UnsignedPayloadTrait extends BooleanTrait {
    public static final ShapeId ID = ShapeId.from("aws.api#unsignedPayload");

    public UnsignedPayloadTrait(FromSourceLocation sourceLocation) {
        super(ID, sourceLocation.getSourceLocation());
    }

    public UnsignedPayloadTrait() {
        this(SourceLocation.NONE);
    }

    public static final class Provider extends BooleanTrait.Provider<UnsignedPayloadTrait> {
        public Provider() {
            super(ID, UnsignedPayloadTrait::new);
        }
    }
}