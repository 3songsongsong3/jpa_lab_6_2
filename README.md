# 비식별 @EmbeddedId (2) jpa_lab_6_2


## @EmbeddedId를 적용한 식별자 클래스는 다음 조건을 만족해야 한다.
 * @Embeddable 어노테이션을 붙여주어야 한다.
 * Serizable 인터페이스를 구현해야한다.
 * equals, hashCode를 구현해야 한다.
 * 기본 생성자가 있어야 한다.
 * 식별자 클래스는 public이어야 한다.
