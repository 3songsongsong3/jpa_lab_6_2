package entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 * @IdClass가 데이터베이스에 맞춘 방법이라면, @EmbeddedId는 좀 더 객체지향적인 방법이다.
 */
@Entity
public class Parent {

    @Embedded
    private ParentId id;

    private String name;

}
