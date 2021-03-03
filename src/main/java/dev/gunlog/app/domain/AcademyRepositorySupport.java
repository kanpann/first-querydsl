package dev.gunlog.app.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static dev.gunlog.app.domain.QAcademy.academy;

@RequiredArgsConstructor
@Repository
public class AcademyRepositorySupport {
    private final JPAQueryFactory queryFactory;

    public List<Academy> findByName(String name){
        return queryFactory.selectFrom(academy)
                .where(academy.name.eq(name))
                .fetch();
    }
}