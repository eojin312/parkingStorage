package marsparkdream.parkingstorage.Model.dto;

import lombok.Builder;
import lombok.Data;
import marsparkdream.parkingstorage.Model.Member;

import java.io.Serializable;

@Data
@Builder(builderMethodName = "memberDtoBuilder")
public class MemberDto implements Serializable {
    private final long id;
    private final String name;
    private final String address;

    public Member toEntity () {
        return Member.memberBuilder()
                .address(address)
                .name(name)
                .build();
    }
}
