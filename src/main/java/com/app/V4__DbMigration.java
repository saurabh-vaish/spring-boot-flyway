package com.app;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.springframework.stereotype.Component;

/**
 * @Author saurabh vaish
 * @Date 21-12-2023
 */

// name should match with naming strategy of flyway
@Component
public class V4__DbMigration extends BaseJavaMigration {

    @Override
    public void migrate(Context context) throws Exception {
        context.getConnection().prepareStatement("insert into test_user(id,name) values(5,'abc')").executeUpdate();
        System.out.println("executed successfully");
    }
}
