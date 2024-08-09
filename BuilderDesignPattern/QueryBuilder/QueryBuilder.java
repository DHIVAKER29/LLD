package com.assignment.question;

@WithBuilder
public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    // This is used to create an instance of the QueryBuilder by the builder,
    //we make this as private to prevent other classes to create instance
    private QueryBuilder(Builder builder){
        this.select = builder.select;
        this.from = builder.from;
        this.where = builder.where;
        this.join = builder.join;
        this.orderBy = builder.orderBy;
        this.groupBy = builder.groupBy;
    }

    //This will return the new instance of the builder object
    private static Builder getBuilder() {
        return new Builder();
    }

    //Creating builder class inside the QueryBuilder class to access it's private constructor
    public static class Builder {

        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;


        public Builder setSelect(String select) {
            this.select = select;
            return this;
        }

        public Builder setFrom(String from) {
            this.from = from;
            return this;
        }

        public Builder setWhere(String where) {
            this.where = where;
            return this;
        }

        public Builder setJoin(String join) {
            this.join = join;
            return this;
        }

        public Builder setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        // here we are creating QueryBuilder object by using Builder(this) object
        public QueryBuilder build() {
            return new QueryBuilder(this);
        }
    }
}