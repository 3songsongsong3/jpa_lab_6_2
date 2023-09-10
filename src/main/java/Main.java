import entity.Parent;
import entity.ParentId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_lab_2");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        // 엔티티 저장
        Parent parent = new Parent();
        ParentId parentId = new ParentId("myId1", "myId2");
        parent.setId(parentId);
        parent.setName("parentName");
        em.persist(parent);

        // 엔티티 조회
        ParentId parentId1 = new ParentId("myId1", "myId2");
        Parent parent1 = em.find(parentId1);

    }
}
