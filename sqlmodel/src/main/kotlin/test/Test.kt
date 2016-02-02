package test

import com.querydsl.core.annotations.QueryEntity
import com.querydsl.sql.Configuration
import com.querydsl.sql.PostgreSQLTemplates
import com.querydsl.sql.postgresql.PostgreSQLQueryFactory


@QueryEntity
class MyEntity {
    var id: Long = -1

    companion object {

        fun test() {
            val value = QMyEntity.myEntity;

            val configuration = Configuration(PostgreSQLTemplates())
            val sqlQueryFactory = PostgreSQLQueryFactory(configuration, {
                //dataSource.connection ?
                null
            })

            val query = sqlQueryFactory.from(QMyEntity.myEntity)
                    .select(QMyEntity.myEntity.id.max())

            val maxId = query.fetchFirst()
        }

    }

}
