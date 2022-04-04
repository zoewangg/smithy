/*
 * Copyright 2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package software.amazon.smithy.codegen.core.directed;

import software.amazon.smithy.codegen.core.CodegenContext;
import software.amazon.smithy.model.shapes.ServiceShape;
import software.amazon.smithy.model.shapes.StructureShape;
import software.amazon.smithy.model.traits.ErrorTrait;

/**
 * Directive used to generate an error.
 *
 * @param <C> CodegenContext type.
 * @param <S> Codegen settings type.
 * @see DirectedCodegen#generateError
 */
public final class GenerateError<C extends CodegenContext<S, ?>, S> extends ShapeDirective<StructureShape, C, S> {

    GenerateError(C context, ServiceShape service, StructureShape shape) {
        super(context, service, shape);
    }

    /**
     * Gets the {@code error} trait.
     *
     * <p>This is equivalent to calling {@code shape().expectTrait(ErrorTrait.class)}.
     *
     * @return Gets the {@link ErrorTrait} of the error.
     */
    public ErrorTrait errorTrait() {
        return shape().expectTrait(ErrorTrait.class);
    }
}