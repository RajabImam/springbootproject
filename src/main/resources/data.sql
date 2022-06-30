/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  RAJAB IMAM
 * Created: May 11, 2022
 */
INSERT INTO employee (id, name, age) VALUES ('1' , 'Tom' , 30);

/* User master */
INSERT INTO m_user (
user_id
, password
, user_name
, birthday
, age
, gender
, department_id
, role
) VALUES
('system@co.jp' , '$2a$10$bxQQnsNzkFFJAPHc.MGEzOxYYxbn36qKkL6aofw4NiZNA59xfw/4u' , 'System Administrator' , '2000-01-01' , 21, 1,
1, 'ROLE_ADMIN' )
, ('user@co.jp' , '$2a$10$bxQQnsNzkFFJAPHc.MGEzOxYYxbn36qKkL6aofw4NiZNA59xfw/4u' , 'User1' , '2000-01-01' , 21, 2, 2, 'ROLE_GEN
ERAL' )
;
/* Department master */
INSERT INTO m_department (
department_id
, department_name
) VALUES
(1, 'System Management' )
, (2, 'Sales' )
;
/* Salary table */
INSERT INTO t_salary (
user_id
, year_month
, salary
) VALUES
('user@co.jp' , '11/2020' , 2800)
, ('user@co.jp' , '12/2020' , 2900)
, ('user@co.jp' , '01/2021' , 3000)
;