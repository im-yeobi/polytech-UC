package kr.co.uclick.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = 1653554665L;

    public static final QCustomer customer = new QCustomer("customer");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final StringPath birthDate = createString("birthDate");

    public final StringPath email = createString("email");

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath loginId = createString("loginId");

    public final StringPath loginPwd = createString("loginPwd");

    public final CollectionPath<MobilePhone, QMobilePhone> mobilePhones = this.<MobilePhone, QMobilePhone>createCollection("mobilePhones", MobilePhone.class, QMobilePhone.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath regDate = createString("regDate");

    public QCustomer(String variable) {
        super(Customer.class, forVariable(variable));
    }

    public QCustomer(Path<? extends Customer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomer(PathMetadata metadata) {
        super(Customer.class, metadata);
    }

}
