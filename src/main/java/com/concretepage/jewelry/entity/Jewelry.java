	package com.concretepage.jewelry.entity;
	import io.swagger.annotations.ApiModelProperty;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

    @Entity
    @Table(name="jewelry")
    public class Jewelry implements Serializable {
        private static final long serialVersionUID = 1L;

        @Id
        @Column(name="bar_code",  unique=true,columnDefinition="VARCHAR(64)")
        @ApiModelProperty(notes = "The barCode of good")

        private String barCode;
        public Jewelry() {
        }
        public Jewelry(String barCode, String article, String category, String description, Integer cost) {
            this.barCode = barCode;
            this.article = article;
            this.category = category;
            this.description = description;
            this.cost = cost;
        }

        @Column(name="article")
        @ApiModelProperty(notes = "The article of good")

        private String article;

        @ApiModelProperty(notes = "The category of good")
        @Column(name="category")
        private String category;

        public Integer getCost() {
            return cost;
        }

        public void setCost(Integer cost) {
            this.cost = cost;
        }

        @Column(name="cost")
        @ApiModelProperty(notes = "The cost of good")

        private Integer cost;

        public static long getSerialVersionUID() {
            return serialVersionUID;
        }


        public String getBarCode() {
            return barCode;
        }

        public void setBarCode(String barCode) {
            this.barCode = barCode;
        }

        public String getArticle() {
            return article;
        }

        public void setArticle(String article) {
            this.article = article;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Jewelry{" +
                    "barCode='" + barCode + '\'' +
                    ", article='" + article + '\'' +
                    ", category='" + category + '\'' +
                    ", cost=" + cost +
                    ", description='" + description + '\'' +
                    '}';
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Column(name="description")
        private String description;

    }