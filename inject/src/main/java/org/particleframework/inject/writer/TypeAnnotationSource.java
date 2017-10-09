/*
 * Copyright 2017 original authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.particleframework.inject.writer;

import org.particleframework.core.annotation.AnnotationSource;

/**
 * Represents a type {@link AnnotationSource} reference
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public class TypeAnnotationSource {
    final Object declaringType;

    public TypeAnnotationSource(Object declaringType) {
        this.declaringType = declaringType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeAnnotationSource that = (TypeAnnotationSource) o;

        return declaringType.equals(that.declaringType);
    }

    @Override
    public int hashCode() {
        return declaringType.hashCode();
    }
}