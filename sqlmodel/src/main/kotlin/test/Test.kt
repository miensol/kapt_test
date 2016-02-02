package test

import com.querydsl.core.annotations.QueryEntity


@QueryEntity
class MyEntity {
    var id: Long = -1

    companion object {

        fun test() {
            val value = QMyEntity.myEntity;
        }

    }

}
