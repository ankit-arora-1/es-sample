package org.example.elasticsearch.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product")
@Getter
@Setter
public class Product {
    private String id;
    private String title;
}
