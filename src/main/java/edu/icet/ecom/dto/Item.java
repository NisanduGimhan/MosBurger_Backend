package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
    private Long id;
    private String itemNo;
    private String itemType;
    private String name;
    private Double price;
    private String imageUrl;
}
