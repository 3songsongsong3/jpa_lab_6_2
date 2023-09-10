package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;


/**
 * @EmbeddedId를 적용한 식별자 클래스는 다음 조건을 만족해야 한다.
 * 1. @Embeddable 어노테이션을 붙여주어야 한다.
 * 2. Serizable 인터페이스를 구현해야한다.
 * 3. equals, hashCode를 구현해야 한다.
 * 4. 기본 생성자가 있어야 한다.
 * 5. 식별자 클래스는 public이어야 한다.
 */
@Embeddable
public class ParentId implements Serializable {

    @Column(name = "PARENT_ID1")
    private String id;

    @Column(name  = "PARENT_ID2")
    private String id2;

    public ParentId() {}

    public ParentId(String id, String id2) {
        this.id = id;
        this.id2 = id2;
    }

    //equals and hashCode 구현


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParentId parentId = (ParentId) o;
        return Objects.equals(id, parentId.id) && Objects.equals(id2, parentId.id2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id2);
    }
}
