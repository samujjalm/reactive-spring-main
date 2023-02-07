package com.wayfair.samujjal.demo.springwebflux.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Stock {
  @Id
  private String id;

  private String name;

//  @NonNull
  private BigDecimal price;

  private String currency;
}
