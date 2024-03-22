package flab.hanipman.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("MEMBER")
public class Member {
    @Id
    Long id;
    String name;
    String address;
    String reg_date;
    public Member(String name, String address, String regDate) {
        this.name = name;
        this.address = address;
        this.reg_date = regDate;
    }

    public Member() {}


}
