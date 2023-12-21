flyway == Flyway is used to do migrations in db , It reads the sql files from spring boot app and run the queries in the database.

1. For migration store sql files in db.migration folder.
2. By default flyway creates a table to track the files that has been executed.
3. we can changes the database to connect for flyway by default it creates in main db.
4. Every sql file is transactional in flyway, if problems occurs in any place in sql file, it will rollback the previous content of same file.
5. Naming of sql file for flyway = V<squence_number>__<name of file>.sql
6. We can configure these naming rules in properties file.
7. In flyway it is possible to do migration from java code also for that we need to extends class with BaseJavaMigration class and write our queries in migrate method