package com.pojo;

import lombok.Data;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    int id;
    String name;
}
