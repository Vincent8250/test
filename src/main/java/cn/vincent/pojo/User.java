package cn.vincent.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    String name;
    Integer age;
    Gender gender;
    public enum Gender {man, woman}
}
