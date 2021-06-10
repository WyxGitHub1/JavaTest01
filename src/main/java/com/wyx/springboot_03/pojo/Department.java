package com.wyx.springboot_03.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @auther wyx
 * @date 2021-06-08-15:31
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;
    private String departName;

}
