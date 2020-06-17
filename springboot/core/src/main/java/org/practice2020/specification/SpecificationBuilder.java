package org.practice2020.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;

public class SpecificationBuilder<T> {

    /**
     * Спецификация которая хранит текущее состояние
     */
    private Specifications<T> specification;

    public SpecificationBuilder() {
    }

    public SpecificationBuilder(final Specification<T> spec) {
        this.specification = Specifications.where(spec);
    }

    public SpecificationBuilder<T> appendOr(final Specification<T> spec) {
        if (specification == null) {
            specification = Specifications.where(spec);
        }
        else {
            specification = Specifications.where(spec).or(specification);
        }
        return this;
    }

    public SpecificationBuilder<T> appendAnd(final Specification<T> spec) {
        if (specification == null) {
            specification = Specifications.where(spec);
        } else {
            specification = Specifications.where(spec).and(specification);
        }
        return this;
    }

    public Specification<T> build() {
        return Specifications.where(specification);
    }
}
