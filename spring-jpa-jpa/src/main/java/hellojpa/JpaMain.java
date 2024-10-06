package hellojpa;

import jakarta.persistence.*;

import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member memberA = new Member();
            memberA.setName("A");
            Member memberB = new Member();
            memberB.setName("B");
            Member memberC = new Member();
            memberC.setName("C");

            System.out.println("=====================");

            em.persist(memberA);
            em.persist(memberB);
            em.persist(memberC);

            System.out.println("memberA.getId() = " + memberA.getId());
            System.out.println("memberB.getId() = " + memberB.getId());
            System.out.println("memberC.getId() = " + memberC.getId());

            System.out.println("=========================");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
