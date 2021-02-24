entity: Person
utils: JDBCUtils
test: JdbcTest

dao:search update...(data process)  
dao.impl: baseDao(baseSearchAbout) -> UserDaoImpl（from UserDao<Interface>）

service: different functions process（provide supports to web's servlet）

web:  servlets working: processing the data from clients
