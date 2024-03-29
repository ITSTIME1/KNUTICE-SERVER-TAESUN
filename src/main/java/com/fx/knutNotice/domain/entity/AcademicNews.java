package com.fx.knutNotice.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AcademicNews {


    @Id
    private Long nttId;
    private Long boardNumber;
    private String title;
    private String newCheck;

}
