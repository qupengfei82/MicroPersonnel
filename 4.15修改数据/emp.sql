SELECT * FROM employee, empsalary,salary WHERE employee.id = empsalary.eid AND empsalary.sid = salary.id 

SELECT * FROM employee; 
SELECT * FROM empsalary;
SELECT * FROM salary;
SELECT * FROM empsalary WHERE eid > 0 ORDER BY eid ASC 


UPDATE empsalary 
	SET sid = 1 
WHERE
	eid = 1;
UPDATE empsalary 
SET sid = 2 
WHERE
	eid = 2;
UPDATE empsalary 
SET sid = 3 
WHERE
	eid = 3;
UPDATE empsalary 
SET sid = 4 
WHERE
	eid = 4;
UPDATE empsalary 
SET sid = 5 
WHERE
	eid = 5;
UPDATE empsalary 
SET sid = 6 
WHERE
	eid = 6;
UPDATE empsalary 
SET sid = 7 
WHERE
	eid = 7;
UPDATE empsalary 
SET sid = 8 
WHERE
	eid = 8;
UPDATE empsalary 
SET sid = 9 
WHERE
	eid = 9;
UPDATE empsalary 
SET sid = 10 
WHERE
	eid = 10;
UPDATE empsalary 
SET sid = 11 
WHERE
	eid = 11;
UPDATE empsalary 
SET sid = 12 
WHERE
	eid = 12;
UPDATE empsalary 
SET sid = 13 
WHERE
	eid = 13;
UPDATE empsalary 
SET sid = 14 
WHERE
	eid = 14;
UPDATE empsalary 
SET sid = 15 
WHERE
	eid = 15;
UPDATE empsalary 
SET sid = 16 
WHERE
	eid = 16;
UPDATE empsalary 
SET sid = 17 
WHERE
	eid = 17;
UPDATE empsalary 
SET sid = 18 
WHERE
	eid = 18;
UPDATE empsalary 
SET sid = 19 
WHERE
	eid = 19;
UPDATE empsalary 
SET sid = 20 
WHERE
	eid = 20;
UPDATE empsalary 
SET sid = 21 
WHERE
	eid = 21;
UPDATE empsalary 
SET sid = 22 
WHERE
	eid = 22;
UPDATE empsalary 
SET sid = 23 
WHERE
	eid = 23;
UPDATE empsalary 
SET sid = 24 
WHERE
	eid = 24;
UPDATE empsalary 
SET sid = 25 
WHERE
	eid = 25;
UPDATE empsalary 
SET sid = 26 
WHERE
	eid = 26;
UPDATE empsalary 
SET sid = 27 
WHERE
	eid = 27;
UPDATE empsalary 
SET sid = 28 
WHERE
	eid = 28;
UPDATE empsalary 
SET sid = 29 
WHERE
	eid = 29;
UPDATE empsalary 
SET sid = 33 
WHERE
	eid = 33;
UPDATE empsalary 
SET sid = 34 
WHERE
	eid = 34;
UPDATE empsalary 
SET sid = 43 
WHERE
	eid = 43;
UPDATE empsalary 
SET sid = 44 
WHERE
	eid = 44;
UPDATE empsalary 
SET sid = 45 
WHERE
	eid = 45;
UPDATE empsalary 
SET sid = 47 
WHERE
	eid = 47;
UPDATE empsalary 
SET sid = 50 
WHERE
	eid = 50;
UPDATE empsalary 
SET sid = 51 
WHERE
	eid = 51;
UPDATE empsalary 
SET sid = 52 
WHERE
	eid = 52;
UPDATE empsalary 
SET sid = 53 
WHERE
	eid = 53;
UPDATE empsalary 
SET sid = 54 
WHERE
	eid = 54;
UPDATE empsalary 
SET sid = 55 
WHERE
	eid = 55;
UPDATE empsalary 
SET sid = 56 
WHERE
	eid = 56;
UPDATE salary 
SET NAME = '薛磊' 
WHERE
	id = 9;
UPDATE salary 
SET NAME = '张洁' 
WHERE
	id = 10;
UPDATE salary 
SET NAME = '赵琳浩2' 
WHERE
	id = 13;
INSERT INTO `salary` (
	`id`,
	`basicSalary`,
	`bonus`,
	`lunchSalary`,
	`trafficSalary`,
	`allSalary`,
	`pensionBase`,
	`pensionPer`,
	`createDate`,
	`medicalBase`,
	`medicalPer`,
	`accumulationFundBase`,
	`accumulationFundPer`,
	`name` 
)
VALUES
	(
		9,
		9000,
		4000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-01-24 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'市场部工资账套' 
	),
	(
		10,
		2000,
		2000,
		400,
		1000,
		NULL,
		2000,
		0.07,
		'2018-01-01 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'人事部工资账套' 
	),
	(
		13,
		20000,
		3000,
		500,
		500,
		NULL,
		4000,
		0.07,
		'2018-01-25 00:00:00',
		4000,
		0.07,
		4000,
		0.07,
		'运维部工资账套' 
	);
INSERT INTO `salary`
VALUES
	(
		1,
		8000,
		4000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-01-24 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'江南一点雨' 
	);
INSERT INTO `salary`
VALUES
	(
		2,
		9000,
		5000,
		400,
		300,
		NULL,
		2000,
		0.07,
		'2018-02-14 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'陈静' 
	);
INSERT INTO `salary`
VALUES
	(
		3,
		8800,
		4500,
		700,
		400,
		NULL,
		2000,
		0.07,
		'2018-03-21 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'赵琳浩' 
	);
INSERT INTO `salary`
VALUES
	(
		4,
		6000,
		4000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-08-08 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'鹿存亮' 
	);
INSERT INTO `salary`
VALUES
	(
		5,
		7000,
		4500,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2019-10-24 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'姚森' 
	);
INSERT INTO `salary`
VALUES
	(
		6,
		5800,
		2000,
		400,
		200,
		NULL,
		2000,
		0.07,
		'2018-05-20 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'云星' 
	);
INSERT INTO `salary`
VALUES
	(
		7,
		4000,
		1500,
		300,
		100,
		NULL,
		2000,
		0.07,
		'2018-05-20 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'贾旭明' 
	);
INSERT INTO `salary`
VALUES
	(
		8,
		5500,
		3000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-02-11 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'张黎明' 
	);
INSERT INTO `salary`
VALUES
	(
		11,
		6500,
		3000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-02-11 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'江南一点雨2' 
	);
INSERT INTO `salary`
VALUES
	(
		12,
		4500,
		2000,
		600,
		500,
		NULL,
		2000,
		0.07,
		'2018-03-08 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'陈静2' 
	);
INSERT INTO `salary`
VALUES
	(
		14,
		10000,
		8000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-03-09 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'鹿存亮2' 
	);
INSERT INTO `salary`
VALUES
	(
		15,
		3300,
		2000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-04-14 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'姚森2' 
	);
INSERT INTO `salary`
VALUES
	(
		16,
		3500,
		2000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-04-15 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'云星2' 
	);
INSERT INTO `salary`
VALUES
	(
		17,
		4400,
		2200,
		700,
		500,
		NULL,
		2000,
		0.07,
		'2018-04-27 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'贾旭明2' 
	);
INSERT INTO `salary`
VALUES
	(
		18,
		5300,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-05-03 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'王一亭' 
	);
INSERT INTO `salary`
VALUES
	(
		19,
		5400,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-05-05 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'薛磊2' 
	);
INSERT INTO `salary`
VALUES
	(
		20,
		5500,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-08-24 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'张洁2' 
	);
INSERT INTO `salary`
VALUES
	(
		21,
		5600,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-07-29 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'江南一点雨3' 
	);
INSERT INTO `salary`
VALUES
	(
		22,
		5700,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-07-29 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'陈静3' 
	);
INSERT INTO `salary`
VALUES
	(
		23,
		5800,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-07-29 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'鹿存亮3' 
	);
INSERT INTO `salary`
VALUES
	(
		24,
		5900,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-08-24 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'姚森3' 
	);
INSERT INTO `salary`
VALUES
	(
		25,
		5000,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-08-24 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'云星3' 
	);
INSERT INTO `salary`
VALUES
	(
		26,
		6100,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-09-24 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'贾旭明3' 
	);
INSERT INTO `salary`
VALUES
	(
		27,
		6200,
		2000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-09-20 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'张黎明3' 
	);
INSERT INTO `salary`
VALUES
	(
		28,
		6300,
		3000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-09-20 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'薛磊3' 
	);
INSERT INTO `salary`
VALUES
	(
		29,
		6400,
		2000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-10-20 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'江南一点雨4' 
	);
INSERT INTO `salary`
VALUES
	(
		30,
		6500,
		7000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-10-20 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'陈静4' 
	);
INSERT INTO `salary`
VALUES
	(
		31,
		6600,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-10-24 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'赵琳浩4' 
	);
INSERT INTO `salary`
VALUES
	(
		32,
		6700,
		6000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-11-29 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'鹿存亮4' 
	);
INSERT INTO `salary`
VALUES
	(
		33,
		6800,
		7000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-01-28 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'姚森4' 
	);
INSERT INTO `salary`
VALUES
	(
		34,
		6900,
		7000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-01-28 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'云星4' 
	);
INSERT INTO `salary`
VALUES
	(
		35,
		7000,
		6000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-01-18 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'贾旭明4' 
	);
INSERT INTO `salary`
VALUES
	(
		36,
		7100,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-01-17 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'张黎明2' 
	);
INSERT INTO `salary`
VALUES
	(
		37,
		7200,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-01-27 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'薛磊4' 
	);
INSERT INTO `salary`
VALUES
	(
		38,
		7300,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-01-27 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'张洁4' 
	);
INSERT INTO `salary`
VALUES
	(
		39,
		7400,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-07-13 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'江南一点雨5' 
	);
INSERT INTO `salary`
VALUES
	(
		40,
		7700,
		3000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-05-12 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'陈静5' 
	);
INSERT INTO `salary`
VALUES
	(
		41,
		5500,
		4000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-05-11 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'赵琳浩5' 
	);
INSERT INTO `salary`
VALUES
	(
		42,
		6400,
		4000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-05-10 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'鹿存亮5' 
	);
INSERT INTO `salary`
VALUES
	(
		43,
		6000,
		2000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-05-09 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'姚森5' 
	);
INSERT INTO `salary`
VALUES
	(
		44,
		7800,
		3000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-05-25 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'云星5' 
	);
INSERT INTO `salary`
VALUES
	(
		45,
		8000,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-06-25 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'贾旭明5' 
	);
INSERT INTO `salary`
VALUES
	(
		46,
		8800,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-03-25 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'张黎明5' 
	);
INSERT INTO `salary`
VALUES
	(
		47,
		8500,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-03-25 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'薛磊5' 
	);
INSERT INTO `salary`
VALUES
	(
		48,
		8300,
		6000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-03-25 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'张洁5' 
	);
INSERT INTO `salary`
VALUES
	(
		49,
		8200,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-03-25 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'江南一点雨6' 
	);
INSERT INTO `salary`
VALUES
	(
		50,
		8700,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-03-25 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'陈静6' 
	);
INSERT INTO `salary`
VALUES
	(
		51,
		8900,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-03-25 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'赵琳浩6' 
	);
INSERT INTO `salary`
VALUES
	(
		52,
		9000,
		5000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-06-14 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'鹿存亮6' 
	);
INSERT INTO `salary`
VALUES
	(
		53,
		4300,
		2000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-01-14 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'姚森6' 
	);
INSERT INTO `salary`
VALUES
	(
		54,
		5700,
		2000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-01-14 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'云星6' 
	);
INSERT INTO `salary`
VALUES
	(
		55,
		4900,
		2000,
		800,
		500,
		NULL,
		2000,
		0.07,
		'2018-06-14 00:00:00',
		2000,
		0.07,
		2000,
		0.07,
		'江南一点雨' 
	);
UPDATE empslary 
SET sid = 2 
WHERE
	id = 10;
UPDATE empslary 
SET sid = 3 
WHERE
	id = 11;
UPDATE empslary 
SET sid = 4 
WHERE
	id = 12;
UPDATE empslary 
SET sid = 5 
WHERE
	id = 14;
UPDATE empslary 
SET sid = 6 
WHERE
	id = 15;
UPDATE empslary 
SET sid = 7 
WHERE
	id = 20;
UPDATE empslary 
SET sid = 8 
WHERE
	id = 21;
UPDATE empslary 
SET sid = 9 
WHERE
	id = 22;
UPDATE empslary 
SET sid = 10 
WHERE
	id = 24;
UPDATE empslary 
SET sid = 11 
WHERE
	id = 25;
UPDATE empslary 
SET sid = 12 
WHERE
	id = 26;
UPDATE empslary 
SET sid = 13 
WHERE
	id = 28;
UPDATE empslary 
SET sid = 14 
WHERE
	id = 29;
UPDATE empslary 
SET sid = 15 
WHERE
	id = 30;
UPDATE empslary 
SET sid = 16 
WHERE
	id = 31;
UPDATE empslary 
SET sid = 17 
WHERE
	id = 32;
UPDATE empslary 
SET sid = 18 
WHERE
	id = 33;
UPDATE empslary 
SET sid = 19 
WHERE
	id = 34;
UPDATE empslary 
SET sid = 20 
WHERE
	id = 35;
UPDATE empslary 
SET sid = 21 
WHERE
	id = 36;
UPDATE empslary 
SET sid = 22 
WHERE
	id = 38;
	
SELECT * FROM employee; 
SELECT * FROM empsalary;
SELECT * FROM salary;
SELECT * FROM empsalary WHERE eid > 0 ORDER BY eid ASC 

INSERT INTO empsalary
VALUES
	( 1, 12, 13 );
INSERT INTO empsalary
VALUES
	( 2, 12, 13 );
INSERT INTO empsalary
VALUES
	( 3, 13, 13 );
INSERT INTO empsalary
VALUES
	( 4, 14, 13 );
INSERT INTO empsalary
VALUES
	( 5, 15, 13 );
INSERT INTO empsalary
VALUES
	( 7, 16, 13 );
INSERT INTO empsalary
VALUES
	( 8, 17, 13 );
INSERT INTO empsalary
VALUES
	( 9, 18, 13 );
INSERT INTO empsalary
VALUES
	( 13, 19, 13 );
INSERT INTO empsalary
VALUES
	( 41, 20, 13 );
INSERT INTO empsalary
VALUES
	( 42, 22, 13 );
INSERT INTO empsalary
VALUES
	( 2, 23, 9 );
INSERT INTO empsalary
VALUES
	( 44, 24, 13 );
INSERT INTO empsalary
VALUES
	( 45, 25, 13 );
INSERT INTO empsalary
VALUES
	( 46, 26, 13 );
INSERT INTO empsalary
VALUES
	( 47, 27, 13 );
INSERT INTO empsalary
VALUES
	( 48, 28, 13 );
INSERT INTO empsalary
VALUES
	( 49, 29, 13 );
INSERT INTO empsalary
VALUES
	( 50, 30, 13 );
INSERT INTO empsalary
VALUES
	( 51, 31, 13 );
INSERT INTO empsalary
VALUES
	( 52, 32, 13 );
INSERT INTO empsalary
VALUES
	( 53, 35, 13 );
INSERT INTO empsalary
VALUES
	( 54, 36, 13 );
INSERT INTO empsalary
VALUES
	( 55, 37, 13 );
INSERT INTO empsalary
VALUES
	( 56, 38, 13 );
INSERT INTO empsalary
VALUES
	( 57, 39, 13 );
INSERT INTO empsalary
VALUES
	( 58, 40, 13 );
INSERT INTO empsalary
VALUES
	( 59, 41, 13 );
INSERT INTO empsalary
VALUES
	( 60, 42, 13 );
INSERT INTO empsalary
VALUES
	( 61, 46, 13 );
INSERT INTO empsalary
VALUES
	( 62, 48, 13 );
INSERT INTO empsalary
VALUES
	( 63, 49, 13 );
INSERT INTO empsalary
VALUES
	( 64, 50, 13 );
INSERT INTO empsalary
VALUES
	( 65, 51, 13 );
INSERT INTO empsalary
VALUES
	( 66, 55, 13 );