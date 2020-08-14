package com.lingtu.springbootc3p0jpa.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "a_docter")
@Data
@NoArgsConstructor
public class ADocter implements Serializable {
//    private static final Long serializableID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String docName;
    private Integer officeId;
    private String phoneNum;
    private Integer grantId;
    private String isEnable;
}
