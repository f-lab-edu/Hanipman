package flab.hanipman.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Table("MEMBER")
public class Member {
    @Id
    private Long id;
    private String name;
    private String address;
    private String reg_date;
    public Member(String name, String address, String regDate) {
        this.name = name;
        this.address = address;
        this.reg_date = regDate;
    }
}
